package detail;

/**
 * 匿名内部类即使一个类的定义，同时本身也是一个对象，因此从语法上看，它即有定义类的特征，也有创建对象的特征，因此可以调用匿名内部类方法
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        new Outer05().f1();
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1(){
        //可以直接调用，匿名内部类本身就返回一个对象
        new Person(){
            private int n1 = 10;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()方法+  匿名内部类n1 = "+n1);
                System.out.println("匿名内部类重写了hi()方法+  外部类n1 = "+ Outer05.this.n1);
            }
        }.hi();//输出    匿名内部类重写了hi()方法

//        Person p = new Person(){
//            @Override
//            public void hi() {
//                System.out.println("匿名内部类重写了hi()方法");
//            }
//        };
//        p.hi();
        //两种方法调用的结果是一致的

        //可以直接访问外部类的所有成员，包括私有的
        //不能添加访问修饰符，因为它的地位本身就是一个局部变量
        //作用域：仅仅在定义它的方法或代码块中
        //匿名内部类----访问---->外部类成员   访问方式：直接访问
        //外部其他类    不能访问   匿名内部类  (因为 匿名内部类地位是一个局部变量)
        //如果外部类和内部类的成员重名时，内部类访问的话，默认遵守就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问

    }
}

class Person {
    public void hi() {
        System.out.println("Person里面的hi方法");
    }
}

//抽象类/接口