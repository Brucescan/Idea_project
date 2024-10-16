package study;

/**
 * @author bruces
 * @version 1.0
 */
public class StringVSStringBufferVSStringBuilder {
    public static void main(String[] args) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间:" + (endTime - startTime));
        System.out.println("========================");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间:" + (endTime - startTime));
        System.out.println("========================");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间:"+(endTime-startTime));
        //怎样来选择这三种类型,根据实际情况进行
        //1   如果字符串存在大量的修改操作,一般使用StringBuffer  或StringBuilder
        //2   如果字符串存在大量的修改操作,并在单线程的情况下,使用StringBuilder
        //3   如果字符串存在大量的修改操作,并在多线程的情况下,使用StringBuffer
        //4   如果我们字符串很少修改,被多个对象引用,使用String,比如配置信息等

        //StringBuilder  的方法使用和StringBuffer一样,不再说.

    }
}
