package chapter13;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person_ p1 = new Person_(1001,"AA");
        Person_ p2 = new Person_(1002,"BB");
        set.add(p1);
        set.add(p2);
        p1.setScale("CC");//这里修改了"CC",所以它的hash值会发生变化，而第一次挂上的节点的hash值却没有变化，所以
        //并不会找到原来的那个节点，删除就会失败
        set.remove(p1);
        System.out.println(set);
        set.add(new Person_(1001,"CC"));
        //这里自然可以加进去，因为原本的那个并不是这两个值的hash值，所以这个位置本身就是空的自然可以加进去
        System.out.println(set);
        set.add(new Person_(1001,"AA"));
        System.out.println(set);
//      [Person_{num=1002, scale='BB'}, Person_{num=1001, scale='CC'}]
//      [Person_{num=1002, scale='BB'}, Person_{num=1001, scale='CC'}, Person_{num=1001, scale='CC'}]
//      [Person_{num=1002, scale='BB'}, Person_{num=1001, scale='CC'}, Person_{num=1001, scale='CC'}, Person_{num=1001, scale='AA'}]
    }
}
class Person_{
    private int num;
    private String scale;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Person_(int num, String scale) {
        this.num = num;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Person_{" +
                "num=" + num +
                ", scale='" + scale + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_ person = (Person_) o;
        return num == person.num && Objects.equals(scale, person.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, scale);
    }
}