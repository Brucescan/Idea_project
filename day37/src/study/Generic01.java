package study;

import java.util.ArrayList;

/**
 * @author bruces
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("发财", 18));
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("大黄", 5));

        //需求：假如我们的程序员不小心添加了一只猫
        //使用传统方法的问题分析：
        //1、不能对加入到集合ArrayList中的数据类型进行约束(不安全)
        //2、遍历的时候，需要进行类型转换，如果集合中的数据量较大，对效率有影响

        for (Dog dog : arrayList) {
            System.out.println(dog.getName());
            System.out.println(dog.getAge());
        }

        //泛型的好处
        //1、编译时，检查添加元素的类型，提高了安全性
        //2、减少了类型转换的次数，提高效率
        //3、不再提示编译警告
    }
}
/*
要求：请编写程序，在ArrayList中，添加3个Dog对象
Dog对象含有name和age ，并输出name和age
 */

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}