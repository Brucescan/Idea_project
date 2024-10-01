package study;

/**
 * 这个例子主要看一下数组越界的异常
 * 通过调试我们可以看到，   明显的是数组越界的问题
 */
public class Debug02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
