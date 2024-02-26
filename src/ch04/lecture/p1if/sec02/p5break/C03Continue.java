package ch04.lecture.p1if.sec02.p5break;

public class C03Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("i = " + i);

            if (i == 5) {
                continue;
            }
            System.out.println("어떤 명령문" + i);
        }
    }
}
