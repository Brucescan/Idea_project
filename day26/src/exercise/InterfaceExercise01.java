package exercise;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);//23
        System.out.println(A.a);//23
        System.out.println(B.a);//23
    }
}

interface A{
    int a = 23;
}

class B implements A{

}