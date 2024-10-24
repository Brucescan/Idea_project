package chapter13;

import java.util.*;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork03 {

    public static void main(String[] args) {
        Map m = new HashMap();
        TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        m.put("jack", 2600);
        Iterator iterator = m.keySet().iterator();
        System.out.println(m.keySet().getClass());
        while (iterator.hasNext()) {
            String next = (String)iterator.next();
            m.put(next,(int)(m.get(next))+100);
        }
        //遍历循环
        iterator = m.keySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            System.out.println(m.get(next));
        }
    }
}
