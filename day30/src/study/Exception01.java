package study;

/**
 * @author bruces
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //   10/0  会抛出(出现)异常  ArithmeticException
        //当抛出异常后，程序就崩溃了，下面的代码就不再执行
        //java设计   提供了一个叫 异常处理机制来解决该问题

        try {
            int nes = num1 / num2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println("出现异常的原因是"+e.getMessage());
        }


        System.out.println("程序继续执行........");
    }
}

