package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class ListFor {
    public static void main(String[] args) {
        //ArrayList 底层是一个数组
        List list = new ArrayList();
        //1、方式一  ，使用iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
        }

        //2、方式二 ，使用增强for
        for (Object obj : list) {
            System.out.println("obj = " + obj);
        }

        //3、方式三 ，使用普通for
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println("obj = " + obj);
        }
    }
}
