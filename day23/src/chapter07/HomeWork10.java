package chapter07;

public class HomeWork10 {
    public static void main(String[] args) {
        //写出对象向上转型和向下转型的代码，并写出各自都可以调用哪些方法，并写出方法输出什么
        Person_ p = new Student();
        //向上转型可以调用编译类型的方法，但是子类的特殊方法无法调用
        p.eat();
        p.run();

        //向下转型可以调用继承过来的方法也可以继承子类特殊的方法
        Student s = (Student) p;
        s.run();
        s.eat();
        s.study();
    }
}


class Person_ {
    public void run(){
        System.out.println("person run");
    }

    public void eat(){
        System.out.println("person eat");
    }
}

class Student extends Person_{
    public void run(){
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study...");
    }
}