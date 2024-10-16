package study;

import java.util.Calendar;

/**
 * @author bruces
 * @version 1.0
 */
public class Calender_ {
    public static void main(String[] args) {
        //是一个抽象类，它为特定瞬间与一组  诸如 YEAR,MONTH,DAY_OF_MONTH,HOUR等日历字段之间的转换提供了一些方法，并为操作日历字段
        //(例如获得下星期的日期)提供了一些方法

        //Calender是一个抽象类，并且构造器是protected
        //可以通过getINstance()来获取实例
        //提供大量方法与字段提供给程序员使用

        Calendar c = Calendar.getInstance();//创建日历对象//比较简单自由
        System.out.println(c);
        //2、获取日历对象的某个日历字段
        System.out.println("年："+c.get(Calendar.YEAR));
        //为什么要加一，因为在返回月时是从0开始的
        System.out.println("月："+(c.get(Calendar.MONTH)+1));
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+c.get(Calendar.HOUR));
        System.out.println("分钟："+c.get(Calendar.MINUTE));
        System.out.println("秒："+c.get(Calendar.SECOND));
        //Calendar  没有专门的格式化方法，所以需要程序员自己来组合显示
    }
}
