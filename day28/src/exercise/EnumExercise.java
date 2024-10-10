package exercise;

/**
 * @author bruces
 * @version 1.0
 */
public class EnumExercise {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy1 = Gender.BOY;
        System.out.println(boy);//exercise.Gender@xxxxxx
        System.out.println(boy1 == boy);//false
//        Enum
    }
}

/*
代码正确
这是一个枚举类，里面有两个常量，是无参构造器构造的对象

 */
enum Gender {
    BOY, GIRL;
}