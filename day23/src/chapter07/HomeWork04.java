package chapter07;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager bruces = new Manager("bruces", 500, 30);
        Worker smith = new Worker("smith", 300, 30);
        bruces.printSalary();
        smith.printSalary();

    }
}


class Employee{
    private String name;
    private double daySalary;
    private int workDay;

    public Employee(String name, double daySalary, int workDay) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public int getWorkDay() {
        return workDay;
    }
}

class Manager extends Employee{
    public Manager(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }
    public void printSalary(){
        System.out.println(getName()+"\t你的工资是"+(getDaySalary()*getWorkDay()*1.2+1000));
    }
}
class Worker extends Employee{
    public Worker(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }
    public void printSalary(){
        System.out.println(getName()+"\t你的工资是"+(getDaySalary()*getWorkDay()));
    }
}