package study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bruces
 * @version 1.0
 */
public class MapInterfaceTrait {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //Map存放的是键值对，而不是单个对象(更实用)

        Map map = new HashMap();
        map.put("num1", "bruces");
        map.put("num2", "jack");
        map.put("num3", "tom");
        map.put("num1", "brucescan");
        map.put("num4", "brucescan");
        System.out.println("map = " + map);//也是无序的，因为底层还是一个HashMap

        //HashSet也是一个键值对，只不过这个值一直是一个常量的的对象
        //1、Map于Collection并列存在，用于保存具有映射关系的数据：key-value
        //2、Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象(静态内部类)中
        //3、Map中的key不允许重复，原因和HashSet一样，前面分析过源码，但是这个是一种替换机制
        //4，Map中的value可以重复
        //5、Map中的key可以为null。value也可以为null,注意key为null，只能有一个，value为null,可以有多个
        //6、常用String类作为Map的key
        //7、key和value之间存在单项一对一的关系，即通过指定的key总能找到对应的value
        //8、Map存放数据的key-value示意图，一对k-v是放在Node中的，又因为Node实现了Entry接口
        //有些书上也说一对k-v就是一个entry
        //1、k-v最后是HashMap&Node node = newNode(hash,key,value,null)
        //2、k-v为了方便程序员的遍历，还会创建entrySet集合，该集合存放的元素类型是entry,而一个entry对象就包含了
        //key和value EntrySet<Entry<K,V>>
        //3、在EntrySet中定义的类型是Map.Entry，但是实际上存放的还是 HashMap$Node
        //   HashMap$Node 实现了这个Entry这个接口
        //4、当把HashMap$Node对象存放到 entrySet就方便我们的遍历
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
//            System.out.println(entry.getClass());
            //1、先做向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println("key = "+entry.getKey());
            System.out.println("value = "+entry.getValue());
        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());
    }
}
