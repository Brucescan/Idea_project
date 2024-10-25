package study;

/**
 * @author bruces
 * @version 1.0
 */
public class CustomGenericInterface {
    public static void main(String[] args) {
        //1、接口中，静态成员也不能使用泛型(这个和泛型类规定一样)
        //2、泛型接口的类型，在继承接口或者实现接口时确定
        //3、没有指定类型，默认为Object
        System.out.println(IUsb.age);
    }
}


class B implements MyInterface<String,Integer>{

    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }

    @Override
    public String set(String s) {
        return null;
    }
}
interface IUsb<U, R> {
    int age = 10;
    //普通方法中，可以使用接口泛型
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    //在jdk8中，可以在接口中，使用默认方法
    default R method(U u){
        return null;
    }
}

//class C implements IUsb{}

//class A implements IUsb<String,Integer>{}

interface MyInterface<A,B> extends IUsb<String,Integer>{
    A set(A a);
}

//class D implements MyInterface{}