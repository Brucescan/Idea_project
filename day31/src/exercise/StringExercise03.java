package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "bruces";
        String b = new String("bruces");
        System.out.println(a.equals(b));//true
        System.out.println(a==b);//false
        System.out.println(a==b.intern());//true   这里方法调用后返回的是对象b中的常量池中的字符串的地址，自然与a相等
        //检查字符串常量池：首先，intern() 方法会检查字符串常量池中是否已经存在一个与当前字符串内容相同的字符串对象。
        //返回或添加字符串：
        //如果常量池中已经存在，则直接返回池中的字符串对象。
        //如果常量池中不存在，则将当前字符串对象添加到常量池中，并返回这个字符串对象。
        System.out.println(b==b.intern());//true  这里方法左边是b这个对象的地址，而不是其中value属性存放的字符串的地址，而左边是字符串的地址，所以并不相等
    }
}
