package study;

/**
 * @author bruces
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //String 实现了Serializable ,说明String 可以实现串行化，即可以在网络上传输
        //实现了comparable接口，说明String对象可以相互比较
        //字符串的本质仍然是字符数组,并且是final类型的，只要被赋值了就不能改了，注意是地址不能被修改，而不是里面的内容，因为它修饰的是这个引用
        //1、String对象用于保存字符串，也就是一组字符序列
        //2、字符串常量对象是用双引号括起的字符序列。例如“你好”，“12.79”等等
        //3、字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
        //4、String类常用构造器
        //String s1 = new String();
        //String s2 = new String(String original);
        //String s3 = new String(char[] a);
        //String s4 = new String(char[] a,int startIndex,int count)
        String name = "jack";
    }
}
