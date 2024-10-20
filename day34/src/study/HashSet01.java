package study;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bruces
 * @version 1.0
 */
public class HashSet01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        //HashSet不能添加相同的元素/数据？？？？？？？？？
        set.add("lucy");
        set.add("lucy");//这两肯定是同一个 对象，因为他们都指向常量池中的对象
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));//这两个是不同的元素
        System.out.println("set = "+set);

        //再加深一下，非常经典的面试题
        //去看他的源码，即add发生了什么？？？？？？？？？底层机制非常复杂
        set.add(new String("bruces"));//ok
        set.add(new String("bruces"));//????  这个是加入不了的，因为具体我们要看源码，而不是自己在这里妄自推断
        System.out.println("set = " + set);


    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}