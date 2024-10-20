package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bruces
 * @version 1.0
 */
public class SetInterface {
    //1、无序(添加和取出的顺序不一致)，没有索引,但是取出的顺序是固定的
    //2、不允许重复元素，所以最多包含一个null

    //Set接口的遍历方式同Collection的遍历方式一样
    //1、可以使用迭代器
    //2、可以使用增强for
    //因为Set没有索引，所以无法使用普通的for循环取元素
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //HashSet底层是一个数组+链表的形式管理的
        Set set = new HashSet();
        set.add("join");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println("set = " + set);
        System.out.println("===========迭代器方式取出元素=========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("===========增强for方式取出元素=========");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
