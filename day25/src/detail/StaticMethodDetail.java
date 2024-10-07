package detail;

/**
 * 类方法使用注意事项和细节讨论
 * 1、累方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区：
 * 类方法中无this的参数
 * 普通方法中隐含着this的参数
 * 2、类方法可以通过类名调用，也可以通过对象名调用。
 * 3、普通方法和对象有关，需要通过对象名调用，比如对象名.方法名(参数)，不能通过类名调用
 * 4、累方法中不允许使用和对象有关的关键字，比如this和super普通方法(成员方法)可以
 * 5、类方法只能访问静态变量或者静态方法
 * 6、普通成员方法，既可以访问普通成员，也可以访问静态成员
 * 以上皆遵守访问权限
 */
public class StaticMethodDetail {
    public static void main(String[] args) {

    }
}
