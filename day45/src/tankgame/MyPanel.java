package tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

/**
 * @author bruces
 * @version 3.0
 * 坦克大战的绘图区域
 */
//为了监听键盘事件，实现KeyListener
//为了让Panel不停的重绘子弹，我们需要将Panel定义成一个线程类
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    MyTank myTank = null;
    //定义敌人坦克,为什么使用vector?因为vector支持多线程，而其他的数组类型并不支持
    Vector<EnemyTank> enemyTankVector = new Vector<>();
    //定义一个Vector用于存放 爆炸
    //当子弹击中坦克时，就加入一个Bomb对象到其中
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;
    Random random = new Random();

    //定义三张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public MyPanel() {
        myTank = new MyTank(300, 400);//初始化自己的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank em;
            enemyTankVector.add(em = new EnemyTank((int) ((Math.random()) * 1000), 0));
            em.setDirect(2);
            new Thread(em).start();//启动敌人坦克线程
            //给该enemyTank   加入一颗子弹
            Shot shot = new Shot(em.getX() + 20, em.getY() + 60, 2);
            //加入到enemyTank的Vector的对象当中
            em.shots.add(shot);
            //立即启动
            new Thread(shot).start();
        }

        //初始化三张图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形
        //画出自己的坦克
        if (myTank != null && myTank.isLive) {
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        }

        //画出敌人的坦克
        for (EnemyTank enemyTank : enemyTankVector) {
            //判断当前坦克是否存活
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
//                enemyTank.move((random.nextInt(4)),2);

            }
            //画出enemyTank所有的子弹
            for (int i = 0; i < enemyTank.shots.size(); i++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(i);
                if (shot.isLive) {
                    drawBullet(shot.x, shot.y, g);
                } else {
                    //从vector移除
                    enemyTank.shots.remove(shot);
                }
            }
        }
        //画出子弹,因为变成多个子弹了，所以要遍历那个集合来进行绘制
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot != null && shot.isLive) {
                drawBullet(shot.x, shot.y, g);
            } else {//该子弹对象已经无效了，就从shots集合中拿掉就行了
                myTank.shots.remove(shot);
            }
        }

        //如果Bombs 集合中有对象我们就要画出
        Iterator<Bomb> iterator = bombs.iterator();
        while (iterator.hasNext()) {
            Bomb next = iterator.next();
            //根据当前这个bomb对象的life值去画出对象即可
            if (next.life > 6) {
                g.drawImage(image1, next.x, next.y, 60, 60, this);
            } else if (next.life > 3) {
                g.drawImage(image2, next.x, next.y, 60, 60, this);
            } else {
                g.drawImage(image3, next.x, next.y, 60, 60, this);
            }
            //让这个炸弹的生命值减少
            next.lifeDown();
            if (next.life == 0) {
                iterator.remove();
            }
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

    public void drawBullet(int x, int y, Graphics g) {
        g.fillOval(x, y, 5, 5);
    }

    //编写方法，判断我方子弹是否击中敌人
    public void hitTank(Vector<Shot> shots, Tank tank) {
        //判断s 击中坦克
        EnemyTank enemyTank = null;
        MyTank myTank1 = null;
        if (tank instanceof EnemyTank) {
            enemyTank = (EnemyTank) tank;
        } else if (tank instanceof MyTank) {
            myTank1 = (MyTank) tank;
        }
        for (int i = 0; i < shots.size(); i++) {
            Shot s = shots.get(i);
            switch ((enemyTank == null ? myTank1 : enemyTank).getDirect()) {
                case 0:
                case 2:
                    if (s.x > (enemyTank == null ? myTank1 : enemyTank).getX() && s.x < (enemyTank == null ? myTank1 : enemyTank).getX() + 40
                            && s.y > (enemyTank == null ? myTank1 : enemyTank).getY() && s.y < (enemyTank == null ? myTank1 : enemyTank).getY() + 60) {
                        s.isLive = false;
                        (enemyTank == null ? myTank1 : enemyTank).isLive = false;
                        //当敌人坦克击中我方坦克后，就将enemyTank从集合中拿掉
                        if (enemyTank != null) {
                            enemyTankVector.remove(enemyTank);
                        }
                        //创建Bomb对象，并且加入到集合中
                        Bomb bomb = new Bomb((enemyTank == null ? myTank1 : enemyTank).getX(), (enemyTank == null ? myTank1 : enemyTank).getY());
                        bombs.add(bomb);
                    }
                    break;
                case 1://坦克向右
                case 3://坦克向左
                    if (s.x > (enemyTank == null ? myTank1 : enemyTank).getX() && s.x < (enemyTank == null ? myTank1 : enemyTank).getX() + 60
                            && s.y > (enemyTank == null ? myTank1 : enemyTank).getY() && s.y < (enemyTank == null ? myTank1 : enemyTank).getY() + 40) {
                        s.isLive = false;
                        (enemyTank == null ? myTank1 : enemyTank).isLive = false;
                        if (enemyTank != null) {
                            enemyTankVector.remove(enemyTank);
                        }
                        Bomb bomb = new Bomb((enemyTank == null ? myTank1 : enemyTank).getX(), (enemyTank == null ? myTank1 : enemyTank).getY());
                        bombs.add(bomb);
                    }
                    break;
            }
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
                if (myTank.getY() <= 0) {
                    break;
                }
                myTank.moveUp();
                break;
            case KeyEvent.VK_D:
                myTank.setDirect(1);
                if (myTank.getX() + 60 >= 1000) {
                    break;
                }
                myTank.moveRight();
                break;
            case KeyEvent.VK_S:
                myTank.setDirect(2);
                if (myTank.getY() + 60 >= 750) {
                    break;
                }
                myTank.moveDown();
                break;
            case KeyEvent.VK_A:
                myTank.setDirect(3);
                if (myTank.getX() <= 0) {
                    break;
                }
                myTank.moveLeft();
                break;
        }
        this.repaint();
//        if (e.getKeyCode() == KeyEvent.VK_J) {
//            if (myTank.shot == null || !myTank.shot.isLive) {
//                myTank.shotEnemy();
//            }
//        }
        if (e.getKeyCode() == KeyEvent.VK_J) {//发射多颗子弹的情况
            myTank.shotEnemy();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔一百毫秒，自己重绘区域,子弹就移动
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            //判断是否击中了敌人的坦克
            if (myTank.shot != null && myTank.shot.isLive && enemyTankVector.size() != 0) {//当前我的子弹还是存活的
//                for (EnemyTank em : enemyTankVector) {
//                    hitTank(myTank.shot, em);
//                }
                for (int i = 0; i < enemyTankVector.size(); i++) {
                    EnemyTank em = enemyTankVector.get(i);
                    hitTank(myTank.shots, em);
                }
            }
            //以及是否击中了我方坦克
            for (int i = 0; i < enemyTankVector.size(); i++) {
                EnemyTank em = enemyTankVector.get(i);
                if (em.shots.size() != 0 && myTank.isLive) {
                    hitTank(em.shots, myTank);
                }
            }


            this.repaint();
        }
    }
}
