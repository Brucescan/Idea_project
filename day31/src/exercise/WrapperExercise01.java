package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Float f = 1.5f;
        Double d = 100d;

        Object obj1 = true?new Integer(1):new Double(2.0);//三元运算符是一个整体
        System.out.println(obj1);//1.0

        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else{
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);// 1

        //结果不相同。原因是因为这个表达式中最大的精度是double类型。所以会进行自动提升输出就为1.0
    }
}
