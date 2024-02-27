package ch04.lecture.p1if.sec02.ex;

public class Ex05 {
    public static void main(String[] args) {
        int x;
        int y;
        for (x = 1; x <= 15; x++) {
            for (y = 1; y <= 12; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                }
            }
        }
    }
}
