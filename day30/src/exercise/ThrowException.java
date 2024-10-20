package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class ThrowException {
    public static void main(String[] args) {
        try{
            ReturnExceptionDemo.methodA();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();

        //进入方法A
        //进入A方法的finally
        //RuntimeException
        //进入方法B
        //调用B方法的finally
    }
}

class ReturnExceptionDemo{
    static void methodA(){
        try{
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally{
            System.out.println("用A方法的finally");
        }
    }

    static void methodB(){
        try{
            System.out.println("进入方法B");
            return;
        }finally{
            System.out.println("调用B方法的finally");
        }
    }
}