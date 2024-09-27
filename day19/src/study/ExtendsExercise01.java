package study;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
        //输出
        //a
        //b name
        //b
        //在这里，调用首先找无参构造器，里面this方法首先调用了有参构造器，里面第一句应该是默认的super方法，找到父类的无参构造器
        //执行后输出a，之后继续执行有参构造器输出b name 之后，回到无参构造器，输出b，为什么无参构造器没有super方法呢
        //因为super和this只能存在一个，所以b的无参构造器中并没有super方法
    }
}

class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
//        super();隐藏的super
        System.out.println("b name");
    }
}
