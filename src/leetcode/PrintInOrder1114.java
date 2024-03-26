package leetcode;

public class PrintInOrder1114 {
    public void main(String[] args) throws InterruptedException {
        MyClass1 myClass1 = new MyClass1();
        Thread thread1 = new Thread(() -> {
            try {
                myClass1.first(() -> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                myClass1.second(() -> System.out.print("second"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                myClass1.third(() -> System.out.print("third"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }

    public class MyClass1 {
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
    }

}
