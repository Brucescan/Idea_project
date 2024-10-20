package study;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bruces
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        //1、LinkedHashSet 是HashSet的子类
        //2、LinkedHashSet底层是一个LinkedHashMap，底层维护了一个hash表+双向链表
        //3、LinkedHashSet根据元素的hashCode值来决定元素的存储位置，同时使用链表来维护元素的次序
        //使得元素看起来是以插入顺序保存的
        //4、LinkedHashSet不允许添加重复元素
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("bruces");
        System.out.println("set = " + set);
        //说明
        //1、在LinkedHashSet 中维护了一个hash表和双向链表(LinkedHashSet有head和tail)
        //2、每一个节点都有before和after属性，这样可以形成双向链表
        //3、在添加一个元素时，先求hash值，再求索引，确定该元素在hashtable的位置，然后将添加的元素加入到双向链表中(如果已经存在)
        //不添加(原则和hashset一样)
        //tail.next = newElement;  //简单指定
        //newElement.pre = tail;
        //tail = newElement
        //这样的话我们遍历LinkedHashSet  也能确保插入顺序和遍历顺序一致
        //LinkedHashSet   是HashMap的子类
    }
}

class Customer {
    private String name;
    private int num;

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }
}