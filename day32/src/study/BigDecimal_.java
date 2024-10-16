package study;

import java.math.BigDecimal;

/**
 * @author bruces
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //BigDecimal用来表示超级大的双精度类型的精度
//        double d = 199.1111111111111322453453564563;
//        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("19999.9127489234789129078867856756756");
        System.out.println(bigDecimal);
        //1、如果对     BigDecimal   进行加减乘除，需要使用对应的方法
//        System.out.println(bigDecimal+1);//错误的
        //2、创建一个需要操作的   BigDecimal  然后调用相应的方法即可
        BigDecimal bigDecimal1 = new BigDecimal("1111");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //可能抛出异常，因为有可能是除不尽的，因为保留的精度很高，解决方法很简单，在调用这个方法的后面指定一个精度即可
        //如果有无限循环小数，结果就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
