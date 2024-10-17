package exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(2, "bruces");
        System.out.println("第五个元素是" + list.get(4));
        list.remove(6);
        list.set(7, "liuliu");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = "+next);
        }
    }
}
