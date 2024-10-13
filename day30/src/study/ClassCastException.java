package study;

/**
 * @author bruces
 * @version 1.0
 */
public class ClassCastException {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        C c = (C) a;
    }
}
/*
类型转换异常
 */
class A {
}

class B extends A {
}

class C extends A {
}
