package exercise;

public class StaticExercise01 {
    static int count = 9;
    public void count(){
        System.out.println("count="+(count++));
    }
    public static void main(String[] args) {
        new StaticExercise01().count();//9
        new StaticExercise01().count();//10
        System.out.println(StaticExercise01.count);//11
    }
}
