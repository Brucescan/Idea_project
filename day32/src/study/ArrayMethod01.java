package study;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bruces
 * @version 1.0
 */
public class ArrayMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, -1, 7, 0, 89};
        //1、toString返回数组的字符串形式
        System.out.println(Arrays.toString(integers));
        //2、sort排序(自然排序和定制排序)   Integer arr[] = {1,-1,7,0,89}
        //sort重载的，也可以通过传入一个接口，实现定制排序的匿名内部类，要求实现这个compare方法
//        Arrays.sort(integers);//默认排序方法
//        System.out.println(Arrays.toString(integers));
        //这里体现了一种接口编程的方式，使用debug看看源码
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        /*
        while (left < right) {
                int mid = (left + right) >>> 1;
                if (c.compare(pivot, a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
         */
        //3、binarySearch 通过二分搜索法进行查找，要求必须排好序

        //4、copyOf  数组元素的复制

        //5、fill，数组元素的填充

        //6、equals 比较两个数组元素内容是否完全一致

        //7、asList 将一组值，转换成list

    }
}
