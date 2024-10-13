package detail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author bruces
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        try {
            f2();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("这里执行了");
        }
    }

    public static void f2() throws ArithmeticException {
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() {
        //为什么这里调用f3方法它会报错，因为编译时异常必须解决，
        //即这时，就要求f1()必须显示的处理这个异常
//        f3();
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }

    public static void f4() {
        //这里是运行时异常，只有在运行时才会爆出异常
        //java中并不要求程序员显示处理，因为有默认处理机制
        f5();
    }
    public static void f5() throws ArithmeticException{

    }
}
/*
1、对于编译异常，程序中必须处理，比如try-catch或者throws
2、对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
3、子类重写父类的方法时，对抛出异常的规定：子类重写的方法，所抛出的异常类型要么和父类一致，要么为父类抛出的异常的类型的子类型
4、在throws过程中，如果有方法try-catch,就相当于处理异常，就可以不必throws
 */

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    @Override
    public void method() throws NullPointerException {

    }
}