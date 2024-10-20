package study;

/**
 * @author bruces
 * @version 1.0
 */
public class ListSetSelection {
    public static void main(String[] args) {
        //如何选择ArrayList(底层是可变数组)和LinkedList(底层是双向链表)，两个都是线程不安全的
        //1、如果我们改查的操作多，选择ArrayList
        //2、如果我们增删的操作多，选择LinkedList
        //3、一般来说，在程序中。80-90%都是查询，因此大部分情况下会选择ArrayList
        //4、在一个项目中，根据业务灵活选择，也可能这样，一个模块使用的是ArrayList，另外一个模块是LinkedList
    }
}
