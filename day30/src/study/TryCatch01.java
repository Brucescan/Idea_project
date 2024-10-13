package study;

/**
 * @author bruces
 * @version 1.0
 */
public class TryCatch01 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int res = num1/num2;
            System.out.println("这里真的执行吗？");//根据运行结果   这里不执行
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("这里始终要执行");
        }
    }
}
