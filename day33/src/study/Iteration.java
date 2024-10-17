package study;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bruces
 * @version 1.0
 */
public class Iteration {
    public static void main(String[] args) {
        //增强for循环可以  替代  iterator 迭代器，特点：增强for就是简化版的iterator，本质一样
        //只能用于 遍历集合或者数组

        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        for (Object book : col) {
            System.out.println("Book = " + book);
        }
        //增强for，也可以直接在数组使用
        int[] nums = {1, 8, 10, 90};
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
