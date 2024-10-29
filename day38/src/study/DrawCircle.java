package study;

import javax.swing.*;
import java.awt.*;

/**
 * @author bruces
 * @version 1.0
 * 演示如何在面板上画出圆形
 */
public class DrawCircle extends JFrame {//JFrame对应窗口
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        //当点击窗口的关闭的时候，程序就真正退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

class MyPanel extends JPanel {
    //1、MyPanel对象就是一个画板
    //2、而这个Graphics g理解成一支画笔
    //3、Graphics提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图的方法
        super.paint(g);//调用父类的方法完成初始化
        //画一个圆
        g.drawOval(10, 10, 100, 100);
    }
}

//1、先定义一个MyPanel,继承一个JPannel类，画图形就在面板上画
//2、公共类要继承JFrame类，这就类似于一个画框