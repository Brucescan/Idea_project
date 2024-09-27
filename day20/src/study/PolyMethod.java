package study;

public class PolyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A1 a1 = new A1();
        //在这里我们传入不同的参数，就会调用不同的sum方法，体现出了方法的多态
        System.out.println(a1.sum(10,20));
        System.out.println(a1.sum(10,20,30));

        //方法重写体现多态，都是say方法，但是对象不一样，调用的是自己的say方法，这体现了重写的多态
        B1 b1 = new B1();
        a1.say();
        b1.say();

        //这些都是方法的重载。。。。。使用的是方法重写和方法的重载来实现多态
        //接下来来讲对象的多态


    }
}


class B1 {
    public void say() {
        System.out.println("B1 say() 方法被调用...");
    }
}


class A1 extends B1{
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }


    public void say(){
        System.out.println("A1 say() 方法被调用...");
    }
}
