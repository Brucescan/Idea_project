package study;

/**
 * @author bruces
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //toUpperCase
//        String str1 = "hello";
//        System.out.println(str1.toUpperCase());//HELLO
//        //toLowerCase
//        String str2 = "HELLO";
//        System.out.println(str2.toLowerCase());//hello
//        //concat
//        String str3 = "宝玉";
//        str3 = str3.concat("林黛玉").concat("薛宝钗").concat("together");
//        System.out.println(str3);//宝玉林黛玉薛宝钗together
//        //replace 替换字符串中的字符
//        String str4 = "宝玉 and 薛宝钗 薛宝钗 薛宝钗";
//        str4 = str4.replace("薛宝钗", "林黛玉");
//        System.out.println(str4);//宝玉 and 林黛玉 林黛玉 林黛玉
//        //split 分割字符串，对于某些分割字符，我们需要转义  比如| \\等
//        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
//        String[] split = poem.split(",");
////        for (int i = 0; i < split.length; i++) {
////            System.out.println(split[i]);
////        }
//        for (String str : split) {
//            System.out.println(str);
//        }
//        //compareTo 比较两个字符串的大小
//        String str7 = "jch";
//        String str8 = "jack";
//        System.out.println(str7.compareTo(str8));//    这个结果返回的就是"c"-"a"的结果  2  剩下具体的看源码
//        //toCharArray  转换成字符数组
//        String str6 = "happy";
//        char[] chs = str6.toCharArray();
//        for (int i = 0; i < chs.length; i++) {
//            System.out.println(chs[i]);
//        }
        //format 格式化字符串 %s 字符串  %c 字符  %d 整型   %.2f浮点型
        String name = "john";
        int age = 10;
        double score = 98.3 / 3;
        char gender = '男';
        String info = String.format("我的姓名是%s年龄是%d,成绩是%.2f性别是%c，希望大家喜欢我！", name, age, score, gender);
        System.out.println(info);
    }
}
