package study;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void teach(){
        System.out.println("我在教学");
    }

    @Override
    public String say() {
        return super.say()+"\tsalary = "+ salary;
    }
}
