package study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bruces
 * @version 1.0
 */
public class Date_ {
    public static void main(String[] args) throws ParseException {
        //第一代日期类
        //Date:精确到毫秒，代表特定的瞬间
        //SimpleDateFormat:格式和解析日期的类
        //SimpleDateFormat:格式化和解析日期的具体类。它允许进行格式化(日期 -> 文本)，解析(文本 -> 日期)和规范化
//        Date
        Date date = new Date();//获取当前系统时间
        //默认输出日期的格式是国外的方式，因此通常需要对格式进行转换
        System.out.println("当前日期=" + date);

        //创建SimpleDateFormat  对象，可以指定相应的格式这里的格式使用的字母是规定好的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(date);
        System.out.println(format);
        //Date也可以传入一个long整型      通过传入毫秒数来转换成时间


        //可以把一个格式化的字符串转换成对应的date
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("当前时间=" + parse);
    }
}
