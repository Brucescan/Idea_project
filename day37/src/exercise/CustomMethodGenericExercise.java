package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);//这里会进行自动装箱，所以会输出Integer
        apple.fly(new Dog());//Dog
    }
}

class Apple<T, R, M> {
    public <E> void fly(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

    //    public void eat(U u){}
    public void run(M m) {
    }
}

class Dog {
}