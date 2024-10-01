package study;

/**
 * F8逐行执行代码
 * 看一下变量的变化情况
 */
public class Debug01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i;
            System.out.println("i = "+i);
            System.out.println("sum = "+sum);
        }
        System.out.println("程序结束。。。。");
    }
}
