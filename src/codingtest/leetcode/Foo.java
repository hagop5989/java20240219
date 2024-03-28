package codingtest.leetcode;

public class Foo {
    public Foo() throws InterruptedException {
        Thread A = new Thread(() -> {
            try {
                this.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        });
        Thread B = new Thread(() -> {
            try {
                this.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        });
        Thread C = new Thread(() -> {
            try {
                this.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        });
        A.start();
        A.join();
        B.start();
        B.join();
        C.start();
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) {
        try {
            new Foo();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

