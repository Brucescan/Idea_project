package com.study.modifier1;

import com.study.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下只能访问public 修饰的属性或者方法
        //但是不能访问 其他修饰符修饰的属性或者方法
        System.out.println("n1 = " + a.n1);
        System.out.println("不同包");
        a.m1();
//        System.out.println("n2 = " + a.n2);//直接报错
    }
}
