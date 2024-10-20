package study;

import java.util.LinkedList;

/**
 * @author bruces
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //1、LinkedList底层实现了双向链表和双端队列特点

        //2、可以添加任何元素(元素可以重复),包括null

        //3、线程不安全，没有实现同步

        //1、LinkedList底层维护了一个双向链表
        //2、LinkedList中维护了两个属性first和last分别指向首节点和尾节点
        //3、每个节点(Node对象)，里面又维护了一个prev,next,item三个属性，其中通过prev指向前一个
        //通过next指向后一个节点，最终实现双向链表
        //4、双向链表的元素的添加和删除不是通过数组完成的，相对来说效率较高
        //5、模拟一个简单的双向链表
//        LinkedList linkedList = new LinkedList();
        Node jack = new Node("jack");
        Node bruces = new Node("bruces");
        Node mary = new Node("mary");

        //连接三个节点，形成双向链表
        //jack -> bruces -> mary
        jack.next = bruces;
        bruces.next = mary;
        //mary -> bruces -> jack
        mary.pre = bruces;
        bruces.pre = jack;

        //这个就是我们双向链表的头节点
        Node first = jack;
        //尾结点
        Node last = mary;

        //演示从头到尾遍历
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
        System.out.println("==================");
        //演示从尾到头的遍历
        while (true) {
            if (last == null) {
                break;
            }
            //输出first信息
            System.out.println(last);
            last = last.pre;
        }
        System.out.println("==================");

        //添加对象,在bruces 和 mary之间
        Node zhang = new Node("张飞");
        zhang.next = mary;
        zhang.pre = bruces;
        mary.pre = zhang;
        bruces.next = zhang;

        //让first再次指向那个人
        first = jack;
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个Node类，Node对象表示双向链表的一个节点
class Node {
    public Object item;//真正存放数据的地方
    public Node next;//指向后一个节点
    public Node pre;//指向前一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}