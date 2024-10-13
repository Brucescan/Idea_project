package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author bruces
 * @version 1.0
 */
public class Throws {
    public static void main(String[] args) {
        //1、如果一个语句(中的语句执行时)可能发生某种异常，但是并不能确定如何处理这些异常，则此方法应显示的声明
        //抛出异常，表明该方法将不对这些异常进行处理，则由该方法的调用者负责处理
        //2、在方法声明中用throws语句可以声明抛出异常的列表，throws后面的异常类型可以是方法中产生的异常类型，
        // 也可以是它的父类

    }

    public void f1() throws FileNotFoundException, java.lang.NullPointerException {
        //创建了一个文件流对象
        //异常处理    这是一个FileNotFoundException   编译时异常
        //1、使用前面讲过的     try-catch-finally
        //2、使用throws,抛出异常，让调用f1方法的调用这处理
        //3、throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        //4、throws关键字后可以是一个   异常列表，即可以抛出多个异常
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
