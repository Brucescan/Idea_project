package detail;

/**
 * 创建一个子类时，静态代码块，静态属性初始化，普通代码块，普通属性初始化，构造方法的调用顺序如下：
 * (1) 父类的静态代码块和静态属性(优先级一样，按照定义顺序执行)
 * (2) 子类的静态代码块和静态属性(优先级一样，按照定义顺序执行)
 * (3) 父类的普通代码块和普通属性的初始化(优先级一样，按照定义顺序执行)
 * (4) 父类的构造方法
 * (5) 子类的普通代码块和普通属性初始化(优先级一样，按照定义顺序执行)
 * (6) 子类的构造方法
 * <p>
 * 静态代码块只能调用静态成员(静态属性和静态方法)，普通代码块可以调用任意成员
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //1、先进行类的加载
        //2、创建对象
        new C2();
        //结果
        //A2中的静态代码块
        //调用getN1方法
        //B2中的静态代码块
        //调用getN3方法
        //调用getN5方法
        //C2中的静态代码块
        //调用getN2方法
        //A2中的普通代码块
        //调用A2的构造方法
        //B2中的普通代码块
        //调用getN4方法、
        //调用B2的构造方法
        //C2中的普通代码块
        //调用getN6方法
        //调用C2的构造方法
    }
}

class A2 {//父类

    static {
        System.out.println("A2中的静态代码块");
    }

    private int n2 = getN2();

    {
        System.out.println("A2中的普通代码块");
    }

    private static int n1 = getN1();

    public static int getN1() {
        System.out.println("调用getN1方法");
        return 10;
    }

    public int getN2() {
        System.out.println("调用getN2方法");
        return 20;
    }

    public A2() {
        System.out.println("调用A2的构造方法");
    }
}

class B2 extends A2 {//子类

    static {
        System.out.println("B2中的静态代码块");
    }

    {
        System.out.println("B2中的普通代码块");
    }

    private static int n3 = getN3();
    private int n4 = getN4();

    public static int getN3() {
        System.out.println("调用getN3方法");
        return 100;
    }

    public int getN4() {
        System.out.println("调用getN4方法");
        return 200;
    }

    public B2() {
        System.out.println("调用B2的构造方法");
    }
}


class C2 extends B2 {//孙类
    private static int n5 = getN5();

    static {
        System.out.println("C2中的静态代码块");
    }

    {
        System.out.println("C2中的普通代码块");
    }

    private int n6 = getN6();

    public static int getN5() {
        System.out.println("调用getN5方法");
        return 50;
    }

    public int getN6() {
        System.out.println("调用getN6方法");
        return 100;
    }

    public C2() {
        System.out.println("调用C2的构造方法");
    }
}