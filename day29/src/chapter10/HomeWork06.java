package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Car car = new Car(-10);
        car.test();
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷风");
            } else if (temperature < 0) {
                System.out.println("吹暖风");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public void test() {
        Air air = new Air();
        air.flow();
    }
}