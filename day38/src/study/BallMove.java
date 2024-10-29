package study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author bruces
 * @version 1.0
 * java事件处理其实是采取"委派事件模型"。当事件发生时，产生时间的对象，会把此信息传递给事件的监听者处理
 * 这里所说的信息实际上就是java.awt.event事件类库里某个类所创建的对象，我们把他称为"事件的对象"
 */
public class BallMove extends JFrame {
    private MyPanel1 mp = null;

    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove() {
        mp = new MyPanel1();
        this.add(mp);
        this.setSize(400, 300);
        //JFrame 窗口对象可以监听我们的键盘事件，就是我们在mp上发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//面板，可以画出小球
//KeyListener监听器，可以监听键盘的事件
class MyPanel1 extends JPanel implements KeyListener {
    //为了让小球可以移动，将他的左上角坐标设置成变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    //键盘监听有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键被按下的时候，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode());
        //根据用户按下的不同键，来处理小球的移动
        //在java中，会给每一个键分配一个值
//        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//VK_DOWN就是向下的箭头对应的code
//            if(y==400){
//
//            }
//            y++;
//        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
//            y--;
//        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            x--;
//        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            x++;
//        }
        switch(e.getKeyCode()){
            case KeyEvent.VK_DOWN:
                if(y==300){
                    break;
                }
                y++;
                break;
            case KeyEvent.VK_UP:
                if(y==0){
                    break;
                }
                y--;
                break;
            case KeyEvent.VK_LEFT:
                if(x==0){
                    break;
                }
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                if(x==400){
                    break;
                }
                x++;
                break;
        }
        //接下来让面板重新画一次就行的
        if (x >= 0 & x <= 400 & y >= 0 & y <= 300) {
            this.repaint();
        }

    }

    //当某个键释放(松开),该键会被触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}