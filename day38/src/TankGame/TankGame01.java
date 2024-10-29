package TankGame;

import javax.swing.*;

/**
 * @author bruces
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    //定义一个MyPannel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame01();
    }

    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);//这个面板就是游戏的绘图区域
        this.setSize(1000,750);
        //添加事件监听
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
