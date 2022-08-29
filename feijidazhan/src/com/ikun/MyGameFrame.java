package com.ikun;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static com.ikun.GameUtil.*;
public class MyGameFrame extends Frame {
    Image bgImg = GameUtil.getImage("images/background.png");
    Image planeImg = GameUtil.getImage("images/hero1.png");
    Plane plane = new Plane(planeImg,200,580,7);
    Shell[] shells = new Shell[50];

    @Override
    public void paint(Graphics g) {
        g.drawImage(bgImg,0,0,FRAME_WIDTH,FRAME_HIGTH,null);

        plane.drawMySelf(g);
        for (int i=0;i<shells.length;i++){
            if (shells[i]!=null){
                shells[i].drawMySelf(g);
            }
        }
    }

    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);  //窗口默认不可见，需要让他可见
        this.setSize(480,700);
        this.setLocation(50,30);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动窗口绘制线程
        new PaintThread().start();
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());

        //初始化50发炮弹
        for (int i=0;i<shells.length;i++){
            shells[i] = new Shell();

        }
    }



        //键盘监听内部类
        class KeyMonitor extends KeyAdapter{
            @Override
            public void keyPressed(KeyEvent e) {
                plane.addDirection(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                plane.minusDirection(e);
            }
        }

        //重画线程
        class PaintThread extends Thread {
            @Override
            public void run() {
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(40);   //1s=1000ms
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }

    public static void main(String[] args) {
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }

    private Image offScreenImage = null;

    public void update (Graphics g){
        if (offScreenImage == null)
            offScreenImage = this.createImage(FRAME_WIDTH,FRAME_HIGTH); //这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage,0,0,null);
    }

}
