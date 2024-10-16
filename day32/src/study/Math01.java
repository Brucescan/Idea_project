package study;

/**
 * @author bruces
 * @version 1.0
 */
public class Math01 {
    public static void main(String[] args) {
        //Math类包含用于执行基本数学运算的方法,如初等函数,对数,平方根和三角函数
//        Math常用方法(静态方法)
        //1.abs绝对值
        int abs = Math.abs(9);
        System.out.println(abs);//9
        //2.pow  求幂
        double pow = Math.pow(-3.5, 4);
        System.out.println(pow);//150.0625
        //3,ceil  向上取整
        double ceil = Math.ceil(-3.00001);
        System.out.println(ceil);//-3
        //4.floor 向下取整
        double floor = Math.floor(-4.9999);
        System.out.println(floor);//-5

        //5.round 四舍五入   Math.floor(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);//-5

        //
    }
}
