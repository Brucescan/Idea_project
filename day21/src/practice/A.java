package practice;

public class A {
    public int count = 10;
    public void say(){
        //理解这个的关键在于后面的这个动态绑定机制
        System.out.println("我是A类"+this.count);
        System.out.println(this);
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
//        System.out.println(a.count);
//        System.out.println(b.count);
        a.say();

//        System.out.println(a.count);
        b.say();
//        System.out.println(b.count);
    }
}

class B extends A{
    public int count = 20;
//    public void say(){
//        System.out.println("我是B类"+this.count);
//    }
}
