package study;

/**
 * @author bruces
 * @version 1.0
 */
public class CustomGenericMethod {
    public static void main(String[] args) {
        //1、泛型方法，可以定义在普通类中，也可以定义在泛型类中
        //2、当泛型方法被调用时，类型会确定
        //3、public void eat(E e){},修饰符后没有<T,R..> eat方法不是泛型方法，而是使用了泛型
        Car car = new Car();
        //当调用方法时，编译器就会确定类型，所以这个泛型的类型是在调用这个方法的时候确定的
        car.fly("宝马",100);
        car.fly(300,100.1);
    }
}


class Car<T> {
    T t;
    public void run() {//普通方法

    }

    //说明
    //1、<T,R>就是泛型
    //2、是提供给fly使用的
    public <T, R> void fly(T t, R r) {//泛型方法

    }
    //这个方法并不是泛型方法
    //是hi方法使用了类声明的泛型
    public void hi(T t){

    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
}

class Fish<T, R> {
    public void run() {
    }
    //既然定义了这个泛型就要去使用，否则定义这个也没有意义
    public <U, M> void eat(U u,M m) {

    }
}