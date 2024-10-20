package study;

/**
 * @author bruces
 * @version 1.0
 */
public class SimulateLinkedList {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //HashSet  的底层是  HashMap,HashMap的底层是(数组+链表+红黑树)
        //接下来我们模拟简单的数组+链表
        //1、创建一个数组，数组的类型是Node
        //2、有些人把Node[]数组称为表
        Node_[] table = new Node_[16];

        //3、创建节点
        Node_ john = new Node_("john", null);
        table[2] = john;
        Node_ jack = new Node_("jack", null);
        john.next = jack;//将jack节点挂载到john节点后
        Node_ rose = new Node_("Rose", null);
        jack.next = rose;//将rose节点挂载到jack节点后
        Node_ lucy = new Node_("lucy", null);
        table[3] = lucy;
        System.out.println("table = " + table);
    }
}

class Node_ {//节点，存储数据，可以指向下一个节点，从而形成链表
    Object item;//存放数据的

    Node_ next;//指向下一个节点

    public Node_(Object item, Node_ next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node_{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
