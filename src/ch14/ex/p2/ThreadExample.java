package ch14.ex.p2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("음악을 재생합니다.");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        thread2.start();

    }
}
