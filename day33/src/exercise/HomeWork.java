package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork {
    public static void main(String[] args) {
        String s1 = "bruces";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//false
        System.out.println(a.name==b.name); //true

        String s4 = new String("bruces");
        String s5 = "bruces";

        System.out.println(s1==s4);//false
        System.out.println(s4==s5);//false

        String t1 = "hello"+s1;
        String t2 = "hellobruces";
        System.out.println(t1.intern()==t2);//true

        String s6 = "hello"+"bruces";
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}