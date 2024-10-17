package exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小花", 10));
        list.add(new Dog("大黄", 5));
        list.add(new Dog("大白", 100));
        //增强for来进行遍历
        for (Object dog : list) {
            System.out.println(dog);
        }
        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}