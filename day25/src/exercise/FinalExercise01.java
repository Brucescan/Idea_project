package exercise;

public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(new Circle(3).cal());
    }
}


class Circle {
    private double radius;
    private final static double PI ;
    public Circle(double radius) {
        this.radius = radius;
    }
    static {
        PI = 3.14;
    }
    public double cal(){
        return PI*radius*radius;
    }
}