package study;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List接口是Collection接口的子接口
        //1、List集合类中的元素有序(即添加顺序和取出顺序一致)，且可重复，有点类似于队列
        List arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("mary");
        arrayList.add("bruces");
        arrayList.add("tom");
        System.out.println("list = "+arrayList);
        System.out.println("==================");
        //2、List集合中的每个元素都有其对应的顺序索引，即支持索引，索引同数组一样，从零开始
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        System.out.println("==================");
        //3、List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取
        //容器中的元素



        System.out.println("==================");
        //4、jdk API中List接口的实现类中的常用类有    ArrayList,LinkedList,和vector


        System.out.println("==================");

    }
}
