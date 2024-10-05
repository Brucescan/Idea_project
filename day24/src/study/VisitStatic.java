package study;

/**
 * 如何访问类变量
 * 类名.类变量名
 * 对象名.类变量名(静态变量的访问修饰符的访问权限和范围 与普通属性是一样的)
 * 推荐使用类.类变量名
 */
public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量
        //特别说明，类变量是随着类的加载而创建的，并不依赖于对象的实例
        System.out.println(A.name);
    }
}

class A{
    //类变量
    public static String name = "bruces";
}