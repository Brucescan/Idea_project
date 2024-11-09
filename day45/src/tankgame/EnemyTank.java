package tankgame;

import java.util.Random;
import java.util.Vector;

/**
 * @author bruces
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank implements Runnable {
    //创建一个属性，在敌人坦克类，使用vector保存多个Shot
    Vector<Shot> shots = new Vector<>();
    private Shot shot = null;//临时变量
    boolean isLive = true;
    Random random = new Random();//用来进行随机

    public EnemyTank(int x, int y) {
        super(x, y);
    }

//    public void move(int direct, int speed) {
//        setSpeed(speed);
//        setDirect(direct);
//        switch (direct) {
//            case 0:
//                if (getY() <= 0) {
//                    break;
//                }
//                moveUp();
//                break;
//            case 1:
//                if (getX() + 60 >= 1000) {
//                    break;
//                }
//                moveRight();
//                break;
//            case 2:
//                if (getY() + 60 >= 750) {
//                    break;
//                }
//                moveDown();
//                break;
//            case 3:
//                if (getX() <= 0) {
//                    break;
//                }
//                moveLeft();
//                break;
//        }
//    }

    @Override
    public void run() {
        while (true) {
            //让对方坦克只有一个子弹
            if (isLive && shots.size() < 3) {
                switch (getDirect()) {
                    case 0:
                        shot = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        shot = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        shot = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        shot = new Shot(getX(), getY() + 20, 3);
                        break;
                }

                //启动该线程
                shots.add(shot);
                new Thread(shot).start();
            }

            //根据坦克的方向来继续移动
            switch (getDirect()) {
                case 0://向上
                    //让坦克走一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {//判断上边界
                            moveUp();
                        }
                        try {//每次移动休眠50毫秒
                            Thread.sleep(50);
                            moveLeft();
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 1://向右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {//边界检测
                            moveRight();
                        }
                        try {//每次移动休眠50毫秒
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2://向下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {//边界检测
                            moveDown();
                        }
                        try {//每次移动休眠50毫秒
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3://向左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {//边界检测
                            moveLeft();
                        }
                        try {//每次移动休眠50毫秒
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }

            //休眠50毫秒

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            setDirect(random.nextInt(4));//随机生成0-3的整数.设置下一次的方向
//            setSpeed(random.nextInt(10));//设置下一次的速度

            //写多线程的时候一定要考虑清楚什么时候结束
            if (!isLive) {//这个条件是检测坦克是否存活
                break;
            }
            //然后随机的进行移动
        }
    }
}
