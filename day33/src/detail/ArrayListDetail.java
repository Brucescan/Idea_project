package detail;

import java.util.ArrayList;

/**
 * @author bruces
 * @version 1.0
 */
public class ArrayListDetail {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //ArrayList源码分析
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 5; i++) {
            arrayList.add(10 + i);
        }
        arrayList.add(100);
        arrayList.add(200);

    }
}
