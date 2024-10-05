package study;

/**
 * 类变量
 * 提出问题
 * 有一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在有多少人在玩？，比那些程序解决
 * 在每次创建一个小孩对象的时候，我们若是使用一个成员变量，则每次创建对象这个值都会被重置
 * 而我们如果使用全局变量去解决的话，这个数据与操作又会被我们分开
 * 这样写的缺点
 * 1、count是一个独立于对象/类变量
 * 2、以后我们访问count很麻烦，没有使用到OOP
 * 3、因此，我们引出 类变量/静态变量
 * 所以如果我们能够设计一个int count表示总人数，我们在创建一个小孩时，就把count+1,并且
 * 这个count是所有小孩----共享----的
 * 这个时候我们就需要一种全新的变量叫做-------类变量
 */
public class ClassVariable {
    public static void main(String[] args) {
        Child child = new Child("蜘蛛精");
        Child child1 = new Child("白骨精");
        Child child2 = new Child("老鼠精");

        //类变量可以通过类名来访问，也可以通过对象直接来访问
        System.out.println("总共有"+Child.count+"个孩子加入了游戏");
    }
}

class Child{
    private String name;
    public static int count;

    public Child(String name) {
        this.name = name;
        count++;
    }
}