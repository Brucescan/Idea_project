package chapter07;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("bruces", 18, "学生");
        persons[1] = new Person("jack", 8, "婴儿");
        persons[2] = new Person("smith", 38, "程序猿");
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                if (persons[j].getAge() > persons[j+1].getAge()) {
                    Person p = null;
                    p = persons[i];
                    persons[i] = persons[j];
                    persons[j] = p;
                }
            }

        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public String getJob() {
        return job;
    }
}