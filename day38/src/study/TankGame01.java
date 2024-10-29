package study;

import javax.swing.*;
import java.awt.*;

/**
 * @author bruces
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    private MyPanel_ mp = null;

    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel_();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        //当点击窗口的关闭的时候，程序就真正退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

class MyPanel_ extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        int midleX = 100;
        int midleY = 100;
        g.fillRect(midleX-50,midleY-50,16,20);
        g.fillRect(midleX-60,midleY-60,10,35);
        g.fillRect(midleX-40,midleY-60,10,35);
        g.drawLine(54,60,54,30);
    }
}