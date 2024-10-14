package study;

/**
 * @author bruces
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类型转换成String类型
        Integer integer = 10;
        //方式一
        String s1 = integer.toString();
        //方式二
        String s2 = String.valueOf(integer);
        //方式三
        String s3 = integer + "";
        System.out.println(s3);

        //String 转换成包装类类型
        //方式一
        Integer j = new Integer(s1);
        //方式二
        Integer k = Integer.valueOf(s2);
        //方式三，使用到自动装箱
        Integer l = Integer.parseInt(s1);
        //其他类似
    }
}
