package study;

/**
 * 单例设计模式
 * 静态方法与属性的经典使用
 * 设计模式是在大量实践中总结和理论化之后优选的代码结构，编程风格以及解决问题的思考方式。
 * <p>
 * 单例(单个的实例)
 * 1、所谓的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只存在一个
 * 对象实例，并且该类只提供一个取得其对象实例的方法
 * 2、单例模式有两种方式：1、饿汉式2、懒汉式
 * <p>
 * 饿汉式实现如下
 * 1、构造器私有化，防止直接能new出来
 * 2、类的内部创建对象(该对象是static)
 * 3、向外暴露一个静态的公共方法。getInstance
 * 4、代码实现
 * <p>
 * 懒汉式实现如下
 * 1、
 */
public class DesignPatterns {
    public static void main(String[] args) {
//        new GirlFriend("小红");
//        new GirlFriend("小黄");
//        new GirlFriend("小蓝");
        //可以看到我们可以new无数个女朋友，而单例模式保证我们只有一个女朋友
        GirlFriend gf1 = GirlFriend.getInstance();
        GirlFriend gf2 = GirlFriend.getInstance();
        System.out.println(gf1);
        System.out.println(gf2);

    }
}


class GirlFriend {
    private String name;
    //2、类的内部创建对象  这里也体现了为什么叫饿汉式，因为你还没准备和你女朋友深入交流，你的女朋友已经创建好了，在类加载的时候，你的女朋友就创建好了
    private static GirlFriend gf = new GirlFriend("小火龙");

    //1、将构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }

    //3、向外提供一个静态的方法，提供女朋友,为了能够在静态方法中返回gf对象，我们需要将它设置为静态的
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}