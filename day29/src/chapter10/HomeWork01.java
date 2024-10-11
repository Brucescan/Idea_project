package chapter10;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        System.out.println(new Frock().getSerialNumber());
        System.out.println(new Frock().getSerialNumber());
        System.out.println(new Frock().getSerialNumber());
    }
}


class Frock{
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }
}