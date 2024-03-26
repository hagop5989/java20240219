package ch14.lecture.concurrency;

import java.util.ArrayList;

public class C05ArrayList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> list = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30_000; i++) {
                list.add("a");
                list.remove("a");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 30_000; i++) {
                list.add("b");
                list.remove("b");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
