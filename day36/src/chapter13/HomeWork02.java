package chapter13;

import java.util.ArrayList;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car, car1;
        arrayList.add(car = new Car("宝马", 400000));
        arrayList.add(car1 = new Car("宾利", 5000000));
        arrayList.remove(car);
        //查找元素是否存在
        arrayList.contains(car1);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car);
        arrayList1.add(car1);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList.containsAll(arrayList1));
        arrayList.removeAll(arrayList1);
        System.out.println("arrayList = " + arrayList);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}