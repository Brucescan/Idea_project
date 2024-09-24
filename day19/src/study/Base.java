package study;

public class Base {//父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {//父类无参构造器
        System.out.println("父类base()无参构造器被调用...");
    }
    public Base(String name,int age){//又参构造器
        System.out.println("父类Base(String name,int age)无参构造器被调用...");
    }
    public Base(String name){//又参构造器
        System.out.println("父类Base(String name)无参构造器被调用...");
    }
    public void testing100(){
        System.out.println("test100");
    }
    void testing200(){
        System.out.println("test200");
    }
    protected void testing300(){
        System.out.println("test300");
    }
    private void testing400(){
        System.out.println("test400");
    }
    //公共类方法返回私有变量
    public int getN4() {
        return n4;
    }
}
