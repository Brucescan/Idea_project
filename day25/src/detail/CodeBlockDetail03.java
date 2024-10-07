package detail;

/**
 * 构造器的最前面其实隐含了super()和调用普通代码块，、
 * 静态相关的代码块，属性初始化，在类加载时，就执行完毕了，
 * 因此是优先于 构造器和普通代码块执行的
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new B1();
    }
}

class A1{
    {
        System.out.println("A1的普通代码块");
    }
    public A1(){
        super();
        //调用普通代码块
        System.out.println("A1构造器被调用");
    }
}

class B1 extends A1{
    {
        System.out.println("B1的普通代码块");
    }
    public B1(){
        System.out.println("B1构造器被调用");
    }
}
