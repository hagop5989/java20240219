package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();


        class Thread1 extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    System.out.println("띵-소리");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        }
        class Thread2 extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        }
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
