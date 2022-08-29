package com.ikun;

import java.awt.*;

//炮弹
public class Shell extends GameObject{
    double degree;

    @Override
    public void drawMySelf(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,width,height);
        //炮弹沿着任意角度飞行
        x += speed*Math.cos(degree);
        y -= speed*Math.sin(degree);

        //实现边界碰撞回弹
        if (y>GameUtil.FRAME_HIGTH-30|| y<0){
            degree = -degree;
        }
        if (x>GameUtil.FRAME_WIDTH-30|| x<0) {
            degree = Math.PI-degree;
        }

        g.setColor(c);
    }

    public Shell() {
        degree = Math.random()*Math.PI*2;
        x = 200;
        y = 200;
        width = 30;
        height = 30;
        speed = 10;

    }
}
