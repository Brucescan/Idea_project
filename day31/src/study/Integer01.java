package study;

/**
 * @author bruces
 * @version 1.0
 * 包装类与基本类型的转换
 * 1、jdk5前的手动装箱和拆箱方式,装箱：基本数据类型转换成包装类型，反之，拆箱
 * 2，jdk5以后的自动装箱和拆箱方式
 * 3，自动装箱底层调用的是valueOf方法，比如Integer.valueOf()
 */
public class Integer01 {
    public static void main(String[] args) {
        //手动装箱
        int num = 100;
        Integer integer = new Integer(num);
        Integer integer1 = Integer.valueOf(num);

        //手动拆箱
        //Integer  ->  int
        int i = integer.intValue();

        //jdk5以后自动装箱和自动拆箱
        int n2 = 200;
        Integer integer3 = n2;//底层使用的是 Integer.valueOf(n2),而其中的方法return的是new的一个Integer对象，所以本质上调用的还是new的对象
        //自动拆箱   Integer -> int
        int n3 = integer3;
        //这里底层使用的仍然是integer.intValue()
        //其他包装类的用法类似，这里不在一一举例



    }
}

