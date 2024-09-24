package com.study.encapsulation;

public class Encap01 {
    public static void main(String[] args) {
        System.out.println("=============无参构造============");
        Person person = new Person();
        person.name = "bruces";
        person.setAge(20);
        person.setSalary(10000);
        System.out.println(person.getInfo());
        System.out.println("=========构造器与封装的结合========");
        Person person1 = new Person("tom",18,1000);
        System.out.println(person1.getInfo());
    }
}
//将构造器与setXxx结合
class Person {


    public String name;//名字公开
    private int age;//年龄私有
    private double salary;//工资私有
    //自己写 getXxx和 srtXxx   太慢，又快捷键方法
    //使用 alt + insert直接可以生成，接下来就是完善我们的代码
    public Person(){}
    //构造器与封装的结合
    public Person(String name,int age,double salary){
        this.name = name;
        this.setAge(age);//这样可以实现我们本来在函数内部实现的业务逻辑
        this.setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    //实现相关业务逻辑
    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("年龄需要在1-120之间");
            //给一个默认的年龄
            this.age = 18;
        }
    }

    public double getSalary() {
//        想要查看东西时，可以在这里加一些权限或者验证
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return "姓名为"+name+"\t年龄为"+age+"\t薪水为"+salary;
    }
}
