package chapter07;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("bruces",18,"教师",5000);
        Professor professor= new Professor("bruces",18,"教授",5000);
        AssoProfessor assoProfessor = new AssoProfessor("bruces",18,"副教授",5000);
        Lecturer lecturer = new Lecturer("bruces",18,"讲师",5000);
        teacher.introduce();
        professor.introduce();
        assoProfessor.introduce();
        lecturer.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public void introduce() {
        System.out.println("name="+name+"\tage="+age+"\tpost="+post+"\tsalary="+salary);
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name="+getName()+"\tage="+getAge()+"\tpost="+getPost()+"\tsalary="+1.3*getSalary());
    }
}
class AssoProfessor extends Teacher{
    public AssoProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name="+getName()+"\tage="+getAge()+"\tpost="+getPost()+"\tsalary="+1.2*getSalary());
    }
}

class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name="+getName()+"\tage="+getAge()+"\tpost="+getPost()+"\tsalary="+1.1*getSalary());
    }
}