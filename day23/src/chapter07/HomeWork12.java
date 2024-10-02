package chapter07;

public class HomeWork12 {
    public static void fun(Person1 p) {
        if (p instanceof Student_) {
            p.print();
        }else if(p instanceof Teacher_){
            p.print();
        }
    }

    public static void main(String[] args) {
        Person1[] persons = new Person1[4];
        persons[0] = new Student_("su", '男', 20, "6666");
        persons[1] = new Student_("liu", '男', 21, "312205040229");
        persons[2] = new Teacher_("jack", '男', 30, 10);
        persons[3] = new Teacher_("bruces", '男', 35, 15);
        for (int i = 0; i < persons.length; i++) {
            fun(persons[i]);
        }
    }
}

class Student_ extends Person1 {
    private String stu_id;

    public Student_(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("学号是："+stu_id+"\n");
        study();
        System.out.println(play());
        System.out.println("-------------------------------------");
    }
}

class Teacher_ extends Person1 {
    private int work_age;

    public Teacher_(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("工龄："+work_age+"\n");
        teach();
        System.out.println(play());
        System.out.println("-------------------------------------");
    }
}

class Person1 {
    private String name;
    private char sex;
    private int age;

    public Person1(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    public void print() {
        System.out.println("学生的信息：");
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"性别："+sex);
    }
}