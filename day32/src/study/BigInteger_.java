package study;

import java.math.BigInteger;

/**
 * @author bruces
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //当我们编程中需要处理很大的整数，long不够用的时候
        BigInteger b1 = new BigInteger("123456789000000000000000000000000");
        BigInteger b2 = new BigInteger("200");
        //1、在对BigInteger进行加减乘除的时候，需要使用对应的方法，不能直接进行+ - * /
//        System.out.println(b1+1);//错误的
        //2、这个时候可以创建一个 要操作的 BIgInteger 然后进行相应的操作
        //
        b1 = b1.add(b2);//加法
        b1 = b1.subtract(b2);//减法
        b1 = b1.multiply(b2);//乘法
        b1 = b1.divide(b2);//除法
        System.out.println(b1);
    }
}
