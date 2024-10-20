package study;

import java.util.LinkedList;

/**
 * @author bruces
 * @version 1.0
 * LinkedList源码分析
 */
public class LinkedList02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);
        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        //这里调用默认移除函数，删除的是第一个节点
        linkedList.remove();
        linkedList.remove(2);
        //这个方法删除的是指定的对象元素
//        linkedList.remove(Object obj);
//        linkedList.remove(kk);

        linkedList.set(0, "bruces");
        System.out.println("===============");
        for (Object obj : linkedList) {
            System.out.println(obj);
        }
        Object obj = linkedList.get(0);
        System.out.println("obj = " + obj);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
