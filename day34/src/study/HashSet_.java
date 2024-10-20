package study;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bruces
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        //1、HashSet实现了Set接口

        //2、HashSet 实际上是HashMap
        //3、可以存放null值，但是只能存放一个null,即元素不能重复
        //4、HashSet不保证元素是有序的，取决于hash后，再确定索引的结果
        //5、不能有重复的元素/对象
        Set set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("Rose"));
        //可以通过remove指定删除哪个对象
        set.remove("john");
        System.out.println("set = " + set);
    }
}
