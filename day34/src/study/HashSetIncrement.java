package study;

import java.util.HashSet;

/**
 * @author bruces
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for (int i = 0; i <= 100; i++) {
//            hashSet.add(i);
//        }
//        System.out.println("hashSet = " + hashSet);
        //!!!!!!!!!!!!!需要注意的是当size达到阈值的时候，就会扩容，而这个size的大小，是根据我们添加的这个有多少个成功的元素决定的，
        //若是一条链条的长度达到8的话也会进行扩容
        for (int i = 0; i < 12; i++) {
            hashSet.add(new A(i));
        }
    }
}

/*
HashSet底层是HashMap，第一次添加时，table数组扩容到16；
临界值(threshold)是  16*加载因子(loadFactor)是0.75 = 12
如果table数组使用到了临界值 12，就会扩容到 16*2 = 32，新的临界值就是 32 * 0.75 = 24，以此类推
 */
class A {
    private int i;

    public A(int n) {
        this.i = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}