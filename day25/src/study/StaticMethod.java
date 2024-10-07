package study;

/**
 * 类方法
 * 1、注意只能直接访问类的静态成员(静态方法与静态变量)
 * 2、普通方法即可以调用非静态成员，也可以调用静态成员
 * 3、类方法与类变量是不会被继承的，因为他们属于类
 * 4、this 和super是不能调用类变量与类方法的，因为他们是属于类的，而不是实例对象的
 * 类方法使用场景
 * 当方法中不涉及任何和对象相关的成员，则可以将该方法设计成静态方法，提高开发效率
 * 比如工具类(utils)中的方法   Math类 Arrays类 Coolections集合类
 * 在实际开发中，我们往往会将一些通用的方法，设计成静态方法，这样我们就不需要创建对象就可以使用了
 * 比如打印一维数组，冒泡排序，完成某个计算任务 等等
 */
public class StaticMethod {
    public static void main(String[] args) {
        Stu bruces = new Stu("bruces");
        Stu jack = new Stu("jack");
        bruces.payFee(1000);
        jack.payFee(5000);
//        Math
    }
}
class Stu{
    private String name;
    private static double totalFee = 0;
    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double fee){
        Stu.totalFee += fee;
    }
    public static void showFee(){
        System.out.println("总学费为"+totalFee);
    }
}