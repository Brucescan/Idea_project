package study;

/**
 * 局部内部类是定义在外部类的局部位置，比如方法中，并且有类名。
 * 1、可以直接访问外部类的所有成员，包括私有的
 * 2、不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符的。但是可以使用final修饰，因为局部变量也可以使用final
 * 3、作用域：仅仅在定义它的方法或者代码块中
 * 4、局部内部类  访问  外部类的成员   访问方式：直接访问
 * 5、外部类   访问  局部内部类的成员  访问方式：创建对象，再访问
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        //这里面会定义一个类，之后创建该类的实例对象调用其中的方法
        outer02.m1();
        System.out.println("outer02 hashcode="+outer02);
    }
}


class Outer02 {//外部类
    private int n1 = 100;
    public void m3(){
        System.out.println("Outer02中的m3()方法");
    }
    public void m1() {//外部类方法
        //1、局部内部类是定义在外部类的局部位置，通常在方法
        //3、不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量不能使用修饰符
        //但是可以使用final修饰   如果没有使用final修饰的话，也可以被继承
        final class Inner02{//局部内部类(本质仍然是一个类)
            private int n1 = 10;
            public void m2() {
                //5、局部内部类可以直接访问外部类的成员，比如下面  外部类  n1 和 方法 m1
                System.out.println("n1 = " + n1+"\t外部类的n1 = "+Outer02.this.n1);
                //如果是this.n1的话  这个this就是inner02这个对象
                System.out.println("Outer02.this hashcode="+Outer02.this);
                //Outer02.this  本质上就是外部类的对象  哪个对象，哪个对象调用了m1方法，谁就是这个对象
                //2、可以直接访问外部类的所有成员，包含私有的
                m3();
            }
        }
        //6、外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.m2();

        //4、作用域：仅仅在定义它的方法或代码块中
    }

    //6、外部其他类不能访问局部内部类   因为局部内部类地位上是一个局部变量
    //7、如果外部类和局部内部类的成员重名是，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类.this.成员)去访问
}