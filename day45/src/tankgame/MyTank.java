package tankgame;

import java.util.Vector;

/**
 * @author bruces
 * @version 3.0
 */
public class MyTank extends Tank {
    //定义一个Shot对象,表示一个射击行为
    Shot shot = null;
    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shotEnemy() {
        //注意创建shot对象的时候，要注意根据当前MyTank对象的位置和方向来创建Shot
        switch (getDirect()) {//得到坦克的方向
            case 0://向上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1://向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2://向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3://向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }
        //把新创建的shot放到集合中
        if(shots.size()<=5){
            shots.add(shot);
        }
        //创建好shot对象后开始启动线程

        new Thread(shot).start();

    }
}
