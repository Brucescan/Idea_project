package chapter07;

public class HomeWork05 {
    public static void main(String[] args) {

    }
}


class Grand{
    String name="AA";
    private int age = 100;
    public void g1(){}
}

class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){
        //super方法可以访问哪些成员(属性和方法)？
        //name="AA" 方法g1可以访问
        //this可以访问哪些成员？
        //this 可以访问id="001" score=0 name="AA" 方法g1
    }
}


class Son extends Father{
    String name = "BB";
    public void g1(){

    }
    private void show(){
        //super方法可以访问哪些成员(属性和方法)？
        //super 可以访问id="001"  name="AA" 方法g1
        //this可以访问哪些成员？
        ////this 可以访问id="001"  name="BB" Son方法g1
    }
}