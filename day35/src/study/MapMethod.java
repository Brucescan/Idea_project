package study;

import java.util.HashMap;

/**
 * @author bruces
 * @version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        //put添加元素
        HashMap hashMap = new HashMap();
        hashMap.put("num1", "bruces");
        hashMap.put("num2", "jack");
        hashMap.put("num3", "tom");
        hashMap.put("num1", "brucescan");
        hashMap.put("num4", "brucescan");
        //remove:根据键删除映射关系
        hashMap.remove("num1");
        //get:根据键获取值
        System.out.println(hashMap.get("num2"));//jack
        //size:获取元素个数
        System.out.println(hashMap.size());//3
        //isEmpty:判断个数是否为0
        System.out.println(hashMap.isEmpty());//false
        //clear:清除
        hashMap.clear();
        //containsKey:查找键是否存在
        hashMap.containsKey("num1");//false
    }
}
