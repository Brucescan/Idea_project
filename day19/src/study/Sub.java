package study;

public class Sub extends Base{
    public Sub(String name,int age){
        //想调用无参构造器，直接不写super即可
        System.out.println("子类Sub(String name,int age)构造器被调用....");
    }
    public Sub(){//子类构造器
//        super();//默认调用父类的无参构造器
        //想要调用，名字，年龄的构造器，显示传参即可
        super("smith",10);
//        this("bruces");//错误的
        System.out.println("子类Sub()构造器被调用....");
    }
//  当创建子类对象时，不管是用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name){
        //do nothing.......
        //想要调用 名字的构造器，显示调用即可
        super("bruces");
        System.out.println("子类Sub(String name)构造器被调用....");
    }
    public void sayOk(){
        n1 = 10;
        n2 = 20;
        n3 = 30;
        testing100();
        testing200();
        testing300();
//        我们可以看到父类的非private属性与方法都可以访问
        //我们也是可以进行间接访问
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("n4="+getN4());
    }
}
