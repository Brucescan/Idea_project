package study;

/**
 * 当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类
 *
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}


abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //这里实现了也没有什么意义
    //即：父类方法不确定性的问题
    //=====>考虑将该方法设计为抽象方法
    //所谓抽象方法就是没有实现的方法，就是指没有方法体
    //当一个类中存在抽象方法时，需要将该类声明为abstract类
    //一般来说，抽象类会被继承，由其子类实现抽象的方法
    public abstract void eat() ;
}