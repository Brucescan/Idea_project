package exercise;

/**
 * @author bruces
 * @version 1.0
 * 模拟三个售票窗口售票 分别使用继承Thread 和实现Runnable接口方式，并分析有什么问题？
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        //在输出结果上我们可以看到，他们三个线程在一起抢资源，导致互斥和同步的问题
        //
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        //同样也是会出现互斥和同步的问题
    }
}

//先试用Thread方式

class SellTicket01 extends Thread {
    private static int ticket = 100;//三个窗口售票100张,注意要让多个线程共享

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;//售票结束
            }
            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出了一张票"
                    + "剩余票数" + (--ticket));
        }
    }
}

//实现接口的方式
class SellTicket02 implements Runnable {
    private int ticket = 100;//三个窗口售票100张,注意要让多个线程共享

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;//售票结束
            }
            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出了一张票"
                    + "剩余票数" + (--ticket));
        }
    }
}