package study;

import java.util.Hashtable;

/**
 * @author bruces
 * @version 1.0
 */
public class HashTable_ {
    public static void main(String[] args) {
        //1、存放的元素是键值对：即key-value
        //2、hashtable 的键和值都不能为null;否则会抛出空指针异常
        //3、hashTable 使用方法基本和HashMap一致
        //4、hashTable 是线程安全，hashMap是线程不安全的
        //5、底层结构
        //底层有数组，初始化大小为11
        //有临界值，threshold = 8;加载因子也是0.75
        //
        Hashtable hashtable = new Hashtable();
    }
}
