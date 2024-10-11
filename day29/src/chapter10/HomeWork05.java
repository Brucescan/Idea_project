package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {

    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况下，使用马");
    }
}


class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("遇到大河，使用船来过河");
    }
}

class TrafficFactory {
    private TrafficFactory(){}
    private static Horse horse= new Horse();
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vechicle;

    public Person(String name, Vehicles vechicle) {
        this.name = name;
        this.vechicle = vechicle;
    }

    public void passRiver() {
        if(!(vechicle instanceof Boat)){
            vechicle = TrafficFactory.getBoat();
        }
        vechicle.work();
    }

    public void common() {
        if(!(vechicle instanceof Horse)){
            vechicle = TrafficFactory.getHorse();
        }
        vechicle.work();
    }
}