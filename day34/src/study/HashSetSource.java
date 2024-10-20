package study;


import java.util.HashSet;

/**
 * @author bruces
 * @version 1.0
 */
public class HashSetSource {
    public static void main(String[] args) {
        //分析HashSet的添加元素底层是如何实现的(hash()+equals())
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        hashSet.add(new Dog_("jack"));
        hashSet.add(new Dog_("jack"));
        hashSet.add(new String("bruces"));
        hashSet.add(new String("bruces"));
        System.out.println("hashSet = " + hashSet);
        long l1 = -1380402764;
        long l2 = -1380445172;
        System.out.println(l1 ^ (l1 >>> 16));
        System.out.println(l2 ^ (l2 >>> 16));
        /*
        Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
        //这里的table就是HashMap里面的一个数组，类型是Node[]
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //判断p是不是一棵红黑树，如果是一颗红黑树，就调用这个方法进行添加
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {//第三种情况
                for (int binCount = 0; ; ++binCount) {
                    //依次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后

                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        //注意如果在添加到最后，立即判断该链表长度是否等于8，如果等于8，就调用treeifyBin，对当前这个链表进行树化(转成红黑树)
                        //在这个函数中还会进行一个判断，即table的长度是否小于64，如果没有的话，会先进行表的扩容
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }

                    //依次和该链表的每一个元素比较过程中，如果有相同情况，就直接break
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
         */
    }
}
/*
1、HashSet底层是HashMap
2、添加一个元素，先得到hash值，会转成  -> 索引值
3、找到存储数据表table，看这个索引位置是否已经存放的有元素
4、如果没有，直接加入
5、如果有，调用equals比较，如果相同，就放弃添加，如果不相同，则添加到最后
6、在java8中，如果一条链表的元素个数到达TREEIFY_THRESHOLD(默认是8)，并且table的大小 >= MIN_TREEIFY_CAPACITY(默认64)，就会进行树化(红黑树)

 */

class Dog_ {
    private String name;

    public Dog_(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog_{" +
                "name='" + name + '\'' +
                '}';
    }
}