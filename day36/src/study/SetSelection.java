package study;

/**
 * @author bruces
 * @version 1.0
 */
public class SetSelection {
    public static void main(String[] args) {
        //在开发中选择什么集合实现类，主要取决于业务逻辑。
        //1、先判断存储的类型(一组对象或者是一组键值对)
        //2、一组对象：Collection接口
        //          允许重复：List
        //              增删多：LinkedList(底层维护了一个双向链表)
        //              改查多：ArrayList(底层维护了一个Object类型的数组)
        //          不允许重复：Set
        //              无序：HashSet(底层是HashMap，维护了一个哈希表即数组+链表+红黑树)
        //              排序：TreeSet
        //3、一组键值对：Map
        //          键无序：HashMap(底层是Hash表  数组+链表+红黑树)
        //          件排序：TreeMap
        //          键插入和取出顺序一致：LinkedHashMap
        //          读取文件：Properties
    }
}
