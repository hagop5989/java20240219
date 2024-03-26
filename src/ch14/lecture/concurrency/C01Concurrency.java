package ch14.lecture.concurrency;

public class C01Concurrency {
    public static void main(String[] args) throws InterruptedException {
        MyRun1 r = new MyRun1();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        System.out.println("r.getValue()= " + r.getValue()); //
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("r.getValue()= " + r.getValue()); //
    }
}

class MyRun1 implements Runnable {
    private long value;

    public long getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30_000; i++) {
            value++;
        }
    }
}
