package study;

import java.util.*;

/**
 * @author bruces
 * @version 1.0
 */
public class MapForMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1、containsKey:查找键是否存在
        //2、keySet:获取所有的键
        //3、entrySet：获取所有的关系
        //4、values:获取所有的值
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Object value = map.get(next);
            System.out.println(next + "::" + value);
        }
        System.out.println("==================");
        for (Object key : keys) {
            System.out.println(key + "::" + map.get(key));
        }
        System.out.println("==================");
        Set entrys = map.entrySet();//key-value
        for (Object entry : entrys) {
            Map.Entry e = (Map.Entry) entry;
            Object key = e.getKey();
            Object value = e.getValue();
            System.out.println(key + "::" + value);
        }
        System.out.println("==================");
        //把所有的value值取出
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println("values = " + values);
        }
        System.out.println("==================");
        for (Object obj : values) {
            System.out.println("values = "+values);
        }
    }
}
