package com.lmwis.warframe;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException {
        System.out.println("123");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
//        robot.delay(100);
//        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_B);
//        robot.delay(100);
//        robot.keyRelease(KeyEvent.VK_B);abab
    }
}
