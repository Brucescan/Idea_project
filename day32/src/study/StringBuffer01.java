package study;

/**
 * @author bruces
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1、StringBuffer代表可变的字符序列，可以对字符串内容进行增删
        //2、很多方法与String相同，但是StringBuffer是可变长度
        //StringBuffer是一个容器

        //1、StringBuffer的直接父类是AbstractStringBuilder
        //2、实现了一个序列化接口Serializable   说明StringBuffer是可以进行串行化的
        //3、在父类中，AbstractStringBuilder 有属性 char[] value,并且不是final属性的，这个value数组存放的才是我们的字符串内容
        //4、StringBuffer 是一个final类，说明不能被继承
        StringBuffer stringBuffer = new StringBuffer();

        //String   VS     StringBuffer
        //1、String保存的是字符串常量，里面的值不能更改，每次String类的更新实际上是更改地址，效率较低
        //2、StringBuffer保存的是字符串变量，里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，不用每次更新地址，效率较高
        //char[] value; //这个放在堆  这个的空间地址也会更改，比如这个初始数组只有16个大小
        //在我们拼接字符串的时候，需要扩容，会new一个新数组(空间更大),将原来数组的内容拷贝过来，指向新地址。

        String str4 = "hello"+"world";

    }
}
