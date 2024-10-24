package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class Collections_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、Collections是一个操作Set，List，和Mao的工具
        //2、Collections中提供了一系列静态的方法对集合元素进行排序，查询和修改操作
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        //1、reverse(List) :反转List中元素的顺序
        Collections.reverse(list);
        System.out.println("list = " + list);
        System.out.println("===================");
        //2、shuffle(List):对List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println("list = " + list);
        System.out.println("===================");
        //3、sort(List):根据元素的自然顺序对指定的List集合进行按升序排序
        Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("===================");
        //4、sort(List，Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序

        System.out.println("===================");
        //swap(List,int,int):将指定的list集合中的i处元素和j处元素进行交换
        Collections.swap(list, 0, 1);
        System.out.println("交换后的情况  list = " + list);
        System.out.println("===================");
    }
}
