package study;

/**
 * main方法是虚拟机在调用
 * 1、java虚拟机需要调用类的main()方法，所以该方法的访问权限必须是public
 * 2、java虚拟机在执行该方法时不必创建对象，所以该方法必须是static
 * 3、该方法接受String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数，
 * 4、java执行的程序，参数1 参数2 参数3
 * 特别提示
 * 1、在main方法中，我们可以直接调用main方法所在类的静态方法或静态属性
 * 2、但是，不能直接访问该类中的非静态成员，仍然徐呀我们去实例化对象来进行调用
 */
public class mainDetail {
    public static void main(String[] args) {

    }
}
