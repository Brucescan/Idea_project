package study;

/**
 * 接口的多态特性1
 * 1、多态参数，借口的引用可以指向实现了接口的类的对象
 */
public class InterfacePolyParameter {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Camera camera = new Camera();
//        Phone phone = new Phone();
        computer.work(camera);
        //借口的多态体现
        IF if01 = new Monster();
        if01 = new Car();
    }
}

interface IF {

}

class Monster implements IF {

}

class Car implements IF {

}


class Computer {
    //1、MyInterface03 myInterface03  形参是接口类型
    //2、多态参数，只要是实现了这个接口的类的对象实例，都可以接受
    public void work(MyInterface03 myInterface03) {
        myInterface03.start();
        myInterface03.stop();
    }
}

interface MyInterface03 {
    void start();

    void stop();
}


class Camera implements MyInterface03 {

    @Override
    public void start() {
        System.out.println("相机开始工作.....");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作......");
    }
}


class Phone implements MyInterface03 {

    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}