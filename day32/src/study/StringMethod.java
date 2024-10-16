package study;

/**
 * @author bruces
 * @version 1.0
 */
public class StringMethod {
    public static void main(String[] args) {
        //equals  区分大小写，判断内容是否相等
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false
        //equalsIgnoreCase 不区分大小写。判断内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));//true
        //length    获取字符串的个数，字符串的长度
        System.out.println(str1.length());//5
        //indexOf   获取字符在字符串第一次出现的索引，索引从零开始。如果找不到， 返回负一
        System.out.println(str1.indexOf("l"));//2
        //lastIndexOf  获取字符在字符串中最后一次出现的索引，索引从零开始。如果找不到，返回负一
        System.out.println(str1.lastIndexOf("l"));//3
        //sunstring 截取指定范围的子串
        System.out.println(str1.substring(0, 3));//注意这个是左闭右开区间，截取到索引 3-1
        //charAt    获取某索引处的字符。注意不能使用Str[index]这种方式
//        String str = "hello";
        //str[0];不对的
        System.out.println(str1.charAt(0));//h
    }
}
