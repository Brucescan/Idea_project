package study;

/**
 * 多态数组
 */
public class InterfacePolyArr {
    public static void main(String[] args) {
        //接口类型的数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        //遍历循环       调用工作方法
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            //类型判断，调用独有的方法
            if(usbs[i] instanceof Phone_){//判断它的运行类型是Phone_
                ((Phone_) usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    public void call() {
        System.out.println("手机可以打电话.....");
    }

    @Override
    public void work() {
        System.out.println("手机工作中.........");
    }
}

class Camera_ implements Usb {

    @Override
    public void work() {
        System.out.println("相机工作中.......");
    }
}