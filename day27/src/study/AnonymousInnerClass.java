package study;

/**
 * 非常重要！！！！！！！！！
 * (1) 本质是类
 * (2) 内部类
 * (3) 没有名字
 * (4) 同时是一个对象
 * 匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名
 * 匿名内部类的基本语法
 * new 类或者接口(参数列表){
 * 类体
 * };
 */
public class AnonymousInnerClass {//外部其他类
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.method();
    }
}

class Outer03 {//外部类
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //1、需求：想使用A接口  并创建对象
        //2、传统方式，写一个类，实现该接口，并创建对象
        A tiger = new Tiger();
        tiger.cry();
        //3、但是我们Tiger只是想要使用一次的话，后面不再使用，定义一个类的感觉有点啰嗦
        //4、可以使用匿名内部类来简化开发
        //二者效果是一样的
        //tiger_的编译类型是什么？？？？  A
        //tiger_的运行类型是什么？？？？  匿名内部类  xxxx =>  Outer03$1
        /*
            我们看底层  在底层会分配一个类名
            class xxxx(Outer03$1) implements A{
                @Override
                public void cry() {
                    System.out.println("老虎嗷嗷叫.......");
                }
            }
         */
        //在jdk底层，在创建了匿名内部类 Outer03$1,立即马上就创建了一个对象实例，并且把地址返回给tiger_
        A tiger_ = new A(){
            @Override
            public void cry() {
                System.out.println("老虎嗷嗷叫.......");
            }
        };
        //注意！！！！匿名内部类只能使用一次，不能再使用(不能再new对象了)，但是tiger这个对象还可以继续使用
        System.out.println("tiger_的运行类型="+tiger_.getClass());
        tiger_.cry();

        //演示基于类的匿名内部类
        //father   编译类型  Father
        //father   运行类型  Outer03$2
        //底层会创建匿名内部类
        //直接返回匿名内部类的的对象
        //因为本身没有名字，所以根本无法重写构造函数
        //注意  这里的参数列表会自动的传给Father构造器
        Father father = new Father("jack",18){
            @Override
            public void test() {
                System.out.println("从Father类重写了test方法");
            }
        };
        System.out.println(father.age);
        System.out.println("father对象的运行类型="+father.getClass());
    }
}

interface A {//接口
    void cry();
}

class Tiger implements A{

    @Override
    public void cry() {
        System.out.println("老虎嗷嗷叫......");
    }
}

class Father {//类
    public String name;
    public int age;
    public Father(String name,int age) {
        System.out.println("就收到了name="+name);
        this.name = name;
        this.age = age;
    }

    public void test() {

    }
}