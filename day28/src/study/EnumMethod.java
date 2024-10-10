package study;

/**
 * @author bruces
 * @version 1.0
 * 演示Enum类的方法的各种使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2来完成Enum类的方法的演示
        Season2 autumn = Season2.AUTNMN;
        System.out.println(autumn.name());//得到对象名，通toString
        System.out.println("===================");
        System.out.println(autumn.ordinal());//输出的是该枚举对象的次序/编号，从0开始编号
        //从反编译可以看到 有一个values方法，返回的是一个Season2[]  含有定义的所有枚举对象
        System.out.println("===================");
        Season2[] values = Season2.values();
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i].name());
//        }
        for (Season2 season : values) {//增强for循环
            System.out.println(season.name());
        }
        System.out.println("===================");
        //valueOf:将字符串转换成一个枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1、根据你输入的"SPRING" 到Season2的枚举对象中去找
        //2、如果找到了，就返回，如果没有找到，就报错
        Season2 autumn1 = Season2.valueOf("AUTNMN");
        System.out.println(autumn1);
        System.out.println(autumn == autumn1);
        System.out.println("===================");
        //compareTo:比较两个枚举常量，比较的是编号
        //返回的是调用对象的编号减去参数的编号
        System.out.println(Season2.AUTNMN.compareTo(Season2.SUMMER));
    }
}

