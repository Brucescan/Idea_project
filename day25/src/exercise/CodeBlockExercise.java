package exercise;

public class CodeBlockExercise {
    public static void main(String[] args) {
        System.out.println("total="+Person.total);
        System.out.println("total="+Person.total);
        //in static
        //total = 100
        //total = 100
    }
}

class Person {
    public static int total;
    static{
        total=100;
        System.out.println("in static block!");
    }
}