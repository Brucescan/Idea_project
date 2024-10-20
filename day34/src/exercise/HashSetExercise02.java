package exercise;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bruces
 * @version 1.0
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee_ bruces = new Employee_("bruces", 20000);
        bruces.setBirthday(18, 2, 16);
        Employee_ jack = new Employee_("bruces", 2000);
        jack.setBirthday(18, 2, 16);
        hashSet.add(bruces);//true
        hashSet.add(jack);//false
        System.out.println("hashSet = " + hashSet);
    }
}

class Employee_ {
    private String name;
    private double salary;
    private MyDate birthday;

    class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyDate myDate = (MyDate) o;
            return year == myDate.year && month == myDate.month && day == myDate.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }
    }

    public Employee_(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setBirthday(int year, int month, int day) {
        birthday = new MyDate(year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_ employee = (Employee_) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,birthday);
    }

    @Override
    public String toString() {
        return "Employee_{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}