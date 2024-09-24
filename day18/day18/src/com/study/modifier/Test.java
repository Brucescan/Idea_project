package com.study.modifier;
//修饰符细节
//1、修饰符可以用来修饰类中的属性，成员方法及类
//2、！！！！！只有默认的和public 才能修饰类，并且遵循访问权限的特点
//3、成员方法的访问规则和属性一致
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}
