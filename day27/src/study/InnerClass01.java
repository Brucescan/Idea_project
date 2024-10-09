package study;

/**
 * 四种内部类
 * 定义在外部类局部位置上(比如方法内)
 * 1、局部内部类(有类名)
 * 2、匿名内部类(没有类名，重点！！！！！！！)
 * <p>
 * 定义在外部类的成员位置上
 * 1、成员内部类(没用static修饰)
 * 2、静态内部类(使用static修饰)
 */
public class InnerClass01 {//外部其他类

    public static void main(String[] args) {

    }
}


class Outer {//外部类
    private int n1 = 100;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }

    public void m1() {//方法
        System.out.println("m1方法");
    }

    {//代码块
        System.out.println("代码块");
    }

    class Inner {//内部类

    }

}