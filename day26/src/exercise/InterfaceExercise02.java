package exercise;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface AAA {
    int x = 0;
}

class BBB {
    int x = 1;
}

class CCC extends BBB implements AAA {
    public void pX() {
        //可以明确指定x
        //访问接口的 x就使用AAA.x
        System.out.println(AAA.x);
        //访问父类的x就使用super.x即可
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        new CCC().pX();
    }
}