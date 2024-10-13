package detail;

/**
 * @author bruces
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int num = 1;
            int num1 = 0;
            int res = num / num1;
        } catch (NullPointerException e) {
            System.out.println("空指针异常" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常" + e.getMessage());
        } catch (Exception e) {
            System.out.println("异常 = " + e.getMessage());
        }
    }
}
/*
1、如果异常发生了，则异常后面的代码不会执行，直接进入catch块
2、如果异常没有发生，则顺序执行try的代码块，不会进入到catch
3、如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)，则使用finally
4、可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，要求父类异常在后，子类异常在前，比如(Exception在后，NullPointerException在前)，
如果发生异常，只会匹配一个catch，案例演示
5、可以进行try-finally配合使用，这种用法相当于没有捕获异常，因此程序会直接崩掉哦
应用场景   执行一段代码，不管是否发生异常，都必须执行某个业务逻辑
 */

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}