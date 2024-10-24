package study;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author bruces
 * @version 1.0
 */
public class TreeSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //TreeSet(底层是TreeMap),当我们需要排序的时候
        //1、当我们使用无参构造器创造TreeSet的时候，仍然是无序的
        //2、老师希望添加的元素，按照字符串大小来排序
        //3、使用TreeSet提供的一个构造器，可以传入一个比较器，匿名内部类
        //   指定排序规则

//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
                //compareTo方法，逐个字符比较，有不同的返回第一个字符串-第二个字符串不同位置上的字符之差
                //如果两个字符串相等或者前面的字符相同，
                //返回两个字符串长度之差
                //构造器会把传入的比较器对象给到TreeSet的底层TreeMap
                //在调用add方法时，treeSet.add元素时，在底层会执行到
                //parent = t;
//                cmp = cpr.compare(key, t.key);//动态绑定到我们的匿名内部类(对象)compare
//                if (cmp < 0)
//                    t = t.left;
//                else if (cmp > 0)
//                    t = t.right;
//                else//如果相等，及返回0，这个数据(key)加不进去
//                    return t.setValue(value);
                //
            }
        });
        //添加数据,
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println("treeSet = "+treeSet);
    }
}
