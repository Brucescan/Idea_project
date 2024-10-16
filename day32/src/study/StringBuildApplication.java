package study;

/**
 * @author bruces
 * @version 1.0
 */
public class StringBuildApplication {
    public static void main(String[] args) {
        //String  StringBuffer  StringBuilder 的比较
        //1、StringBuild和StringBuffer 非常相似，均代表可变的字符序列，而且方法也一样
        //2、String:不可变字符序列，效率低，但是复用率高
        //3、StringBuffer:可变字符序列，效率较高(增删)，线程安全
        //4、StringBuilder:可变字符序列，效率最高，线程不安全

        //5、String使用注意说明：
        String s = "a";//创建了一个字符串
        s += "b";//实际上原来的“a”字符串对象已经丢弃了，现在又产生了一个字符串“ab”，如果多次执行这些改变串内容的操作
        //会导致大量副本字符串对象，存留在内存中，降低效率。如果这样的操作放到循环中，会极大的影响程序的性能
        //=======>结论：如果我们对String 做大量修改，不要使用String

//        StringBuffer
    }
}
