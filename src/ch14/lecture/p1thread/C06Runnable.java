package ch14.lecture.p1thread;

public class C06Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() { // 익명 클래스 객체로 만들기
            @Override
            public void run() {
                for (int i = 0; i < 30_000; i++) {
                    System.out.println(i);
                }
            }
        });
        t.start();

        for (int i = 0; i < 30_000; i++) {
            System.err.println(i);
        }
    }
}
