package study;

/**
 * @author bruces
 * @version 1.0
 */
public class DiyException {
    public static void main(String[] args) {


        int age = 10;
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在18-120之间");
        }
    }
}

//自定义的一个异常
//一般情况下我们自定义异常是继承RuntimeException
//即把自定义异常做成运行时异常，好处是，我们可以显示的使用默认的处理机制
//
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
/*
当程序中出现了某些“错误“，但该错误信息并没有在Throwable子类中描述处理，这个时候可以自己设计异常类，用于描述该错误信息

自定义异常的步骤
1、定义类：自定义异常类名(程序员自己写)继承Exception 或者 EuntimeException
2、如果继承Exception  ，属于编译异常
3、如果继承RuntimeException  ,属于运行异常(一般来说继承RuntimeException)
 */