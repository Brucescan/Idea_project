package study;

public class Interface01 {
    public static void main(String[] args) {

    }
}

//1、一个类 implements 实现接口
//2、需要将该接口的所有抽象方法全部都实现
class A implements MyInterface01{
    @Override
    public void hi() {
        System.out.println("hi......");
    }
}