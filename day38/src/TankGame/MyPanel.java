package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author bruces
 * @version 1.0
 * 坦克大战的绘图区域
 */
//为了监听键盘事件，实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    MyTank myTank = null;
    //定义敌人坦克,为什么使用vector?因为vector支持多线程，而其他的数组类型并不支持
    Vector<EnemyTank> enemyTankVector = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        myTank = new MyTank(300, 400);//初始化自己的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank em;
            enemyTankVector.add(em = new EnemyTank((int) ((Math.random()) * 1000), 0));
            em.setDirect(2);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形
        //画出自己的坦克
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        //画出敌人的坦克
        for (EnemyTank enemyTank : enemyTankVector) {
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }
    }

    /**
     * @param x      坦克左上角坐标
     * @param y      坦克左上角坐标
     * @param g      画笔
     * @param direct 坦克方向(上下左右)
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型的坦克设置不同类型的颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.YELLOW);
                break;
        }

        //根据坦克的方向，绘制不同的坦克
        //(0表示向上，1表示向右，2表示向下，3表示向左)
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);//画出tank坐标的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身体
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y, x + 20, y + 30);//炮筒
                break;
            case 1://向右
                g.fill3DRect(x, y, 60, 10, false);//画出tank上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身体
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//炮筒
                break;
            case 2://向下
                g.fill3DRect(x, y, 10, 60, false);//画出tank坐标的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克身体
                g.fillOval(x + 10, y + 20, 20, 20);//圆盖
                g.drawLine(x + 20, y + 60, x + 20, y + 30);//炮筒
                break;
            case 3://向左
                g.fill3DRect(x, y, 60, 10, false);//画出tank上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//坦克身体
                g.fillOval(x + 20, y + 10, 20, 20);//圆盖
                g.drawLine(x + 30, y + 20, x, y + 20);//炮筒
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wasd键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                myTank.setDirect(0);
                if (!myTank.upDownIsLegal()) {
                    break;
                }
                myTank.moveUp();
                this.repaint();
                break;
            case KeyEvent.VK_D:
                myTank.setDirect(1);
                if (!myTank.leftRightIsLegal()) {
                    break;
                }
                myTank.moveRight();
                this.repaint();
                break;
            case KeyEvent.VK_S:
                myTank.setDirect(2);
                if (!myTank.upDownIsLegal()) {
                    break;
                }
                myTank.moveDown();
                this.repaint();
                break;
            case KeyEvent.VK_A:
                myTank.setDirect(3);
                if (!myTank.leftRightIsLegal()) {
                    break;
                }
                myTank.moveLeft();
                this.repaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
