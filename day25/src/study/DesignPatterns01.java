package study;

/**
 * 演示懒汉式的单例模式
 *
 * 1、两种方式最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创子对象实例，而懒汉式在使用时才创建
 * 2、饿汉式不存在线程安全问题，懒汉式存在线程安全问题
 * 3、饿汉式存在浪费资源的可能性，因为如果一个程序猿一个对象实例都没有使用，那么饿汉式创建的对象就浪费了
 * 4、在我们javaSE标准类中，java.lang.Runtie就是经典的单例模式
 */
public class DesignPatterns01 {
    public static void main(String[] args) {
//        Runtime
    }
}

//希望在程序运行过程中，只能创建一个Cat对象
//使用单例模式
class Cat{
    private String name;
    //2、定义一个静态属性对象的引用
    private static Cat cat;
    //1、仍然构造器私有化
    private Cat(String name){
        System.out.println("构造器被调用.......");
        this.name = name;
    }
    //3、定义一个静态的返回对象的方法，在方法中创建这个对象即可，即什么时候获取，什么时候创建   懒汉式
    public static Cat getInstance(){
        if(cat==null){
            cat = new Cat("小花");
        }
        return cat;
    }
}