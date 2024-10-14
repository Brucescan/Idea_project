package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "bruces";
        Person p2 = new Person();
        p2.name = "bruces";

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//trues
        System.out.println(p1.name == "bruces");//true

        String s1 = new String("bruces");
        String s2 = new String("bruces");
        System.out.println(s1 == s2);//false
    }
}

class Person {
    public String name;
}