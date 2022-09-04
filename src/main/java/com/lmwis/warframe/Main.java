package com.lmwis.warframe;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {

    static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws AWTException {
        System.out.println("123");
        int i=0;

        while(i++<220){
//           moveRound(i+200);ee
            qumozhiren();
//            i+= 0.1;
        }
        ;



    }
    public static void moveRound(int pix){
        robot.mouseMove(pix,200);
        robot.delay(500);
        robot.mouseMove(pix,200);
//        robot.delay(200);
//        robot.mouseMove(200,200);


    }
    public static void leftClick(int ms){
        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

    }

    public static void qumozhiren(){
        // 蓄力发射eee
        robot.keyPress(KeyEvent.VK_E);
        robot.delay(800);
        robot.keyRelease(KeyEvent.VK_E);

        robot.delay(400);

        // 引爆
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }
}
