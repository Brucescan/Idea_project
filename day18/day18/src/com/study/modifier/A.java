package com.study.modifier;

//快捷键
// 1、导入所需要的类，使用   alt + enter
// 2、生成构造方法         alt + insert
// 3、自动的分配变量名    在后面加.var
// 4、补全代码            alt + /
public class A {
    //4个属性分别使用不同的修饰符来修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        //在同一个类中，可以访问public protected 默认 private 修饰属性和方法
        //该方法可以访问 4个属性
        System.out.println("==========同类===========");
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
        m2();
        m3();
        m4();
    }

    protected void m2(){
        System.out.println("protecte方法调用成功");
    }
    void m3(){
        System.out.println("默认修饰符方法调用成功");
    }
    private void m4(){
        System.out.println("private方法调用成功");
    }
}
