package study;

/**
 * @author bruces
 * @version 1.0
 */
public class String02 {
    public static void main(String[] args) {
        //创建String的两种方式
        //1、方式一：直接赋值
        //先从常量池查看是否有"bruces"的数据空间，如果有，直接指向；如果没有则重新创建，然后指向。
        //s最终指向的就是常量池的地址空间
        String s2 = "bruces";
        String s = "bruces";
        //2、方式二：调用构造器
        //现在堆中创建空间，里面维护了value属性，指向常量池的bruces空间。如果常量池没有“bruces”，重新创建
        //如果有，直接通过value指向。最终指向的是堆中的空间地址
        String s1 = new String("bruces");
    }
}
