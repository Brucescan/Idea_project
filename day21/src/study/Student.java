package study;

public class Student extends Person{
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    public void study(){
        System.out.println("学生在学习");
    }

    @Override
    public String say() {
        return super.say()+"\tscore = "+score;
    }
}
