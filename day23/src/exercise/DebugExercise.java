package exercise;

//debug对象创建的过程，加深对调试的理解
public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //1、加载Person类信息
        //2、初始化变量，包括默认初始化，显示初始化以及构造初始化
        //3、返回对象的地址
        Person person = new Person("jack",18);
        System.out.println(person);
    }
}


class Person {
    private String name = "bruces";
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}