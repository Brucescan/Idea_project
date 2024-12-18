package study;

import java.util.HashMap;

/**
 * @author bruces
 * @version 1.0
 */
public class HashMapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //扩容机制同HashSet
        //1、HashMap底层维护了Node类型的数组table，默认为null
        //2、当创建对象时，将加载因子(loadfactor)初始化为0.75
        //3、当添加key-val时，通过key的hash值得到在table的索引。然后判断该索引处是否有元素，如果没有元素直接添加
        //如果相等，则直接替换成val，如果不相等需要判断是树结构还是链表结构，做出相应的处理，如果添加时发现容量不够，
        //需要扩容
        //4、第一次添加，需要扩容table容量为16，临界值(threshold)为12
        //5、以后再扩容，则需要扩容table容量为原来的两倍，即24，依次类推
        //6、在java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认为64)
        //就会进行树化(红黑树)
        HashMap map = new HashMap();
        map.put("java", 10);
        map.put("php", 10);
        map.put("java", 20);
        System.out.println("map = " + map);
    }
}
