package exercise;

/**
 * 对于抽象类来说，有一个最佳实践，设计模式中的模板模式
 * 需求
 * 1、有多个类，完成不同的任务
 * 2、要求能够得到各自完成任务的时间
 * 3、编程实现
 */
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.job();
        BB bb = new BB();
        bb.job();
    }
}

class AA {
    public void calculateTimes(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("AA执行时间为" + (end - start));
    }
    //1、一个计算任务
    public void job() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 800000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("AA执行时间为" + (end - start));
    }
}

class BB {
    public void job() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 800000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("BB执行时间为" + (end - start));
    }
}


