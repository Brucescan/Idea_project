package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "bruces";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s4);//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s1 == s2);//false
    }
}
