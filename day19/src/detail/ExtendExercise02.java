package detail;

public class ExtendExercise02 {
    public static void main(String[] args) {
        C c = new C();
        //hahah 我是B类的有参构造
        //我是C类的有参构造
        //我是C类的无参构造
    }
}


class A{
    public A(){
        System.out.println("我是A类");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        System.out.println(name+"我是B类的有参构造");
    }
}

class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造");
    }
    public C(String name){
        super("hahhaa");
        System.out.println("我是C类的有参构造");
    }
}