package ch14.lecture.p1thread;

public class C07Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30_000; i++) {
                System.out.println(i);
            }
        });
        t1.start();

        for (int i = 0; i < 30_000; i++) {
            System.err.println(i);
        }
    }
}
