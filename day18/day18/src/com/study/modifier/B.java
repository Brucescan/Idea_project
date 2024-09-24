package com.study.modifier;

public class B {
    public void say(){
//        在同一个包的情况下，可以访问public,protected,默认修饰符修饰的属性和方法，不能访问私有修饰符修饰的属性与方法
        A a = new A();
//        根据代码提示我们就可以看到，只能访问到n1,n2,n3变量
        System.out.println("========同包==========");
        System.out.println("n1 = "+a.n1);
        System.out.println("n2 = "+a.n2);
        System.out.println("n3 = "+a.n3);
        a.m2();
        a.m3();
    }
}
