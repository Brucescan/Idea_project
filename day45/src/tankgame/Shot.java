package tankgame;

/**
 * @author bruces
 * @version 3.0
 * 射击，射击一颗子弹
 */
public class Shot implements Runnable {
    int x;//子弹的x坐标
    int y;//子弹的y坐标
    int direct = 0;//子弹的方向
    int speed = 2;//子弹的速度
    boolean isLive = false;//子弹是否存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        isLive = true;
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            //线程休眠 50毫秒
            //根据方向改变x或者y坐标
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            System.out.println("子弹 x = " + x + "子弹 y = " + y);
            //当子弹碰到敌人坦克时，也应该结束线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子线程退出");
                isLive = false;
                break;//子弹的边界检测
            }
        }
    }
}
