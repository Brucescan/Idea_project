package study;

/**
 * @author bruces
 * @version 1.0
 */
public class CustomGenerics {
    public static void main(String[] args) {
        //1、普通成员也可以使用泛型(属性，方法)
        //2、使用泛型的数组不能初始化
        //3、静态类型不能使用类的泛型
        //4、泛型类的类型，是在创建对象时确定的(因为创建对象时，需要指定确定类型)
        //5、如果在创建对象时，没有指定类型，默认为Object
    }
}

class Person<E, R, M> {
    E e;
    R r;
    M m;
    M[] m1;

    public Person(E e) {
        this.e = e;
    }

    public E f1() {
        return e;
    }
}