package chapter11;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

    }
}


class EcmDef {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = cal(num1,num2);
            System.out.println("计算结果是"+num3);
        } catch (NumberFormatException e) {
            System.out.println("数据格式不对");
        } catch (ArithmeticException e) {
            System.out.println("除数是0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        } finally{
            System.out.println("程序执行到这里");
        }

    }

    public static int cal(int n1, int n2) throws ArithmeticException{
        return n1/n2;
    }
}