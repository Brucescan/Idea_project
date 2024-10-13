package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class Exception01 {
    public static int method(){
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if(names[1].equals("tom")){//空指针错误
                System.out.println(names[1]);
            }else{
                names[3] = "bruces";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        }catch(NullPointerException e){
            return ++i;//这里的++i仍然会执行   ===>保存临时变量  temp = 3;  返回的是这个临时变量
        }finally{
            ++i;//4
            System.out.println("i="+i);//i = 4
//            return 4;
            //finally语句会覆盖前面return的值
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}

