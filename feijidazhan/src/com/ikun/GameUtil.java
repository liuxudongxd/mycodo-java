package com.ikun;
//工具类

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class GameUtil {

    public static final int FRAME_WIDTH=480;
    public static final int FRAME_HIGTH=700;

    //构造器私有。防止外部访问
    private GameUtil(){};

    public static Image getImage(String path){
        Image img = null;
        URL url = GameUtil.class.getClassLoader().getResource(path);
        try {
             img = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
}
