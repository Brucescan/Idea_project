package study;
//1、当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，做一些释放资源的操作
//比如有数据库的连接就是一种资源，还比如一个对象打开一个文件，这些都代表了一些资源
//2、什么时候被回收:当某个对象没有任何引用的时候，则jvm就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在
//销毁该对象前，辉县调用finalize方法
//3、垃圾回收机制的调用，是由系统来决定的，也可以通过System.gc()主动触发垃圾回收机制，测试
//4、注意，此方法在JDK9及以上中被弃用，现在逐渐使用Cleaner来替代Finalize
public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        //使这个引用指向空之后就会触发垃圾回收机制,car对象就是一个垃圾，垃圾回收器就会回收(销毁)
        //在销毁对象前，会调用该对象的Finalize方法，这时候我们就可以在finalize中写自己的操作，比如数据库的连接，或者打开的文件流什么的
        bmw = null;
        System.gc();//主动调用垃圾回收器
        //里面也蕴含了多线程的思想
        System.out.println("程序退出了。。。。。。");
        //可以看到只输出了程序退出了，
        //注意！！！！！！不是一变成一个垃圾，立马就会回收(如果是这个的话，会降低性能)，而是有自己的垃圾回收算法(复制算法，标记清除，标记整理)，
        //这个机制   类似于袜子攒到一起洗  资源占用到一定程度就会出发一次垃圾回收机制

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        //默认情况下调用父类的finalize函数
//        super.finalize();
        System.out.println("释放了某些资源");
    }
}