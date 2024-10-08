package study;

/**
 * 我们可以这样理解
 * 接口其实是对java单继承机制的补充
 * <p>
 * 1、接口与继承解决的问题不一样
 * 继承的价值在于：解决代码的复用性和可维护性
 * 接口的价值在于：设计，设计好的各种规范(方法)，让其他类去实现这些方法。
 * <p>
 * 2、接口比继承更加灵活，继承是is-a的关系，而接口只需要满足 like-a的关系
 * 3、接口在一定程度上实现代码解耦
 */
public class InterfaceDetail {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swiming();
    }
}


class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "会爬树.......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swiming();
}

interface Birdable {
    void flying();
}

//继承
class LittleMonkey extends Monkey implements Fishable, Birdable {

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swiming() {
        System.out.println(getName() + "学会了游泳.....");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "学会了飞.......");
    }
}