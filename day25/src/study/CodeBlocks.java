package study;

/**
 * 代码化块又称为初始化块，属于类中的成员(即是类的一部分)，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来
 * 和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用
 * [修饰符]{
 * 代码
 * };
 * 注意
 * 1、修饰符可选，要写的话，也只能写static
 * 2、代码块分为两类，使用static修饰的叫静态代码块，没有static修饰的叫普通代码块
 * 3、逻辑与可以为任何逻辑语块
 * 4、;可以写上，也可以省略
 * 应用场景
 * 1、相当于另一种形式的构造器(对构造器的补充机制)，可以做初始化的操作
 * 2、如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性
 * 3、这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
 * 4、代码块调用的顺序优先于构造器
 */
public class CodeBlocks {
    public static void main(String[] args) {
        new Movie("侏罗纪公园",100,"卡梅隆");
        new Movie("侏罗纪公园",100);
        new Movie("侏罗纪公园");
    }
}


class Movie{
    private String name;
    private double price;
    private String director;

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
        this.name = name;
    }
    {
        System.out.println("电影屏幕打开。。。。");
        System.out.println("广告开始。。。。。");
        System.out.println("电影正式开始。。。。");
    };
}