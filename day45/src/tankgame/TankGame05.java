package tankgame;

import javax.swing.*;

/**
 * @author bruces
 * @version 3.0
 */
public class TankGame03 extends JFrame {
    //定义一个MyPannel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame03();
    }

    public TankGame03() {
        mp = new MyPanel();
        new Thread(mp).start();//启动画板线程
        this.add(mp);//这个面板就是游戏的绘图区域
        this.setSize(1000,750);
        //添加事件监听
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
