package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));//true
        System.out.println(a==b);//false
    }
}
