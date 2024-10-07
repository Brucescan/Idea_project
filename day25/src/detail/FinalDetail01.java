package detail;

/**
 * final使用细节
 * 1、fianl修饰的属性又叫常量，一般用xx_xx_xx来命名
 * 2、final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以加在如下位置之一
 * (1) 定义时：如public final double TAX_RATE = 0.08;
 * (2) 在构造器中
 * (3)在代码块中
 * 3、如果final修饰的属性时静态的，则初始化的位置只能时
 * (1) 定义时
 * (2) 在静态代码块，不能在构造器中赋值
 * 4、final类不能继承，但是可以实例化对象
 * 5、如果类不是final类，但是含有final方法，则该方法虽然不能被重写，但是可以被继承
 */
public class FinalDetail01 {
    public static void main(String[] args) {

    }
}
