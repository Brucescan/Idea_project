package chapter11;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        if(args[4].equals("john")){//数组索引越界异常
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object o = args[2];
        Integer i = (Integer) o;//类型转换错误

    }
}
