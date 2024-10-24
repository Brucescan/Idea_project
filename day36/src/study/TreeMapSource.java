package study;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author bruces
 * @version 1.0
 */
public class TreeMapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //使用默认构造器创造一个Map，是一个无序的
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((String) o1).compareTo((String) o2);//按照字符串的大小进行比较
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");

    }
}
