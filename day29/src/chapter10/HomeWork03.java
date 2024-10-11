package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        new Cellphone().testWork(new Computer() {
            @Override
            public void work() {
                System.out.println("计算中......");
            }
        });
    }
}

interface Computer {
    void work();
}

class Cellphone {
    public void testWork(Computer computer){
        computer.work();
    }
}