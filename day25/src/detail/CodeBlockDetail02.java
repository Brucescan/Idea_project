package detail;

/**
 * 创建一个对象时，在一个类的调用顺序是：(重点，难点)
 * 1、调用静态代码块和静态属性初始化(注意：静态代码和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按照他们定义的顺序调用)
 * 2、调用普通代码块和普通属性的初始化(注意：普通代码和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通变量初始化，则按照他们定义的顺序调用)
 * 3、调用构造方法
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        new A();
    }
}


class A{
    private int n2 = getN2();
    private static int n1 = getN1();
    {
        System.out.println("A普通代码块01");
    }
    static{
        System.out.println("A静态代码块01");
    }

    public static int getN1(){
        System.out.println("getN1被调用。。。");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2被调用。。。");
        return 50;
    }
    public A(){
        System.out.println("A()构造器被调用");
    }
}