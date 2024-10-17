package study;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bruces
 * @version 1.0
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、collection实现子类可以存放多个元素，每个元素都可以是Object
        //2、有些Collection的实习类，可以存放重复的元素，有些不可以
        //3、有些Collection的实现类，有些是有序(List)的，有些是无序的(Map)
        //4、Collection 接口没有直接的实现子类，是通过它的子接口Set和List来实现的

        //因为接口不能实例化，所以我们使用ArrayList来进行常用方法的演示
        Collection col = new ArrayList();
        col.add("小龙女");
        col.add(100);//col.add(new Integer(100))
        col.add(true);
        col.add("小龙女");
        col.add(new Integer(10));
        System.out.println("col = " + col);
        System.out.println("======================");


        col.remove("小龙女");//指定删除某个元素
        System.out.println("col = " + col);
        boolean contains = col.contains(10);
        System.out.println(contains);//查看集合中是否有这个元素
        System.out.println(col.size());//返回元素的个数
        System.out.println(col.isEmpty());//集合是否为空
        col.clear();//清空集合中元素
        System.out.println(col);
        System.out.println("======================");


        Collection c = new ArrayList();
        c.add("AA");
        c.add("CC");
        c.add("BB");
        col.addAll(c);//一次性添加多个元素   可以传入一个集合
        System.out.println("col = "+col);
        System.out.println("======================");


        Collection c2 = new ArrayList();

        c2.add("CC");
        c2.add("AA~");
        boolean containsAll = col.containsAll(c2);//查找是否存在这个集合的所有元素
        System.out.println(containsAll);
        col.removeAll(c2);//删除多个元素
    }
}
