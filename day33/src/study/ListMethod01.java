package study;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruces
 * @version 1.0
 */
public class ListMethod01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("mary");
        //1、add方法，在index位置插入ele元素,前面不带索引的话  默认是在最后面
        list.add(1, "bruces");
        System.out.println("list = " + list);
        System.out.println("======================");
        //addAll 方法，从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("贾宝玉");
        list2.add("林黛玉");
        list.addAll(1, list2);
        System.out.println("list = " + list);
        System.out.println("==================");
        //get方法   获取指定位置的元素
        System.out.println(list.get(0));
        System.out.println("==================");
        //indexOf 返回这个对象在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//0
        System.out.println("==================");
        //lastIndexOf 返回这个对象在集合中最后一次出现的位置
        list.add("tom");
        System.out.println(list.lastIndexOf("tom"));
        System.out.println("==================");
        //remove 移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list = " + list);
        System.out.println("==================");
        //set设置指定index位置的元素为ele，相当于是替换，这里的索引必须存在
        list.set(1, "1234");
        System.out.println("list = " + list);
        System.out.println("==================");
        //subList 返回从fromIndex到toIndex位置的子集合
        List returnlist = list.subList(0, 2);
        System.out.println("returnList = "+returnlist);//注意这是一个前闭后开的区间
    }
}
