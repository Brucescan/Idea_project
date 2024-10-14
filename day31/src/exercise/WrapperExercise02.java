package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //从源码可以看出，这里主要看范围-128~127就是直接返回，并没有new对象，所以两个就是一个对象
        Integer m = 1 ;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

    }
}
