package exercise;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("bruces",18,'男');
        Person person1 = new Person("bruces",18,'男');
        System.out.println(person.equals(person1));
//        person.createPerson();
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
//            if ((this.getAge() == ((Person)obj).getAge() )&& (this.getName() == ((Person)obj).getName()) &&(this.getGender() == ((Person)obj).getGender())){
//                return true;
//            }
            Person p = (Person)obj;
            //为什么可以直接调用私有属性，因为obj已经在类中了，所以可以直接调用本类属性
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
    //通过此例可以验证得到       在类里面可以直接调用私有属性，包括类额对象成员
//    public void createPerson(){
//        Person person = new Person("jack",18,'男');
//        System.out.println(person.age);
//        System.out.println(person.name);
//        System.out.println(person.gender);
//
//    }
}
