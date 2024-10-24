package chapter13;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author bruces
 * @version 1.0
 */
public class HomeWork05 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());//没有实现compara接口，所以会抛出异常，再进行比较的时候
    }
}
class Person{}
