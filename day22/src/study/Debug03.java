package study;

import java.util.Arrays;

/**
 * 演示如何追源码，看看java设计者是怎么实现的。(提高编程思想)
 * 小技巧：可以将光标放在某个变量上，可以看到最新的数据
 * F7跳入代码块
 */
public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {8, -1, 199, 70, 10};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
