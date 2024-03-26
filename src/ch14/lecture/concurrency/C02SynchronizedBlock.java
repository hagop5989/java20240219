package ch14.lecture.concurrency;

public class C02SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        MyObject2 o = new MyObject2();


        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(o.getValue());
    }
}

class MyObject2 implements Runnable {
    private long value;
    private Object lock;

    public long getValue() {
        return value;
    }

    public void setLock(Object o) {
        this.lock = o;
    }

    public void update() {
        for (int i = 0; i < 30_000; i++) {
            // synchronized block , 여러쓰레드가 동시에 참조할수있는 참조값을 ()에 넣기
            synchronized (this) {
                value++;
            }
        }
    }

    @Override
    public void run() {
        update();
    }
}
