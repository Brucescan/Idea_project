package study;

import java.util.Vector;

/**
 * @author bruces
 * @version 1.0
 */
public class Vector01 {
    public static void main(String[] args) {
        //Vector  和  ArrayList的比较
        //ArrayList     可变数组        版本jdk1.2        不安全，效率高     如果有参构造1.5倍，如果无参初始是10，从第二次开始按1.5扩增
        //Vector        可变数组        版本jdk1.0        安全，效率不高     如果是无参，默认10，满后按二倍扩容，如果指定大小，则每次直接按两倍扩
        Vector vector = new Vector();
        //new Vector 默认给的是10个
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(11);
        vector.add(12);
        vector.add(13);


    }
}
