package ch04.lecture.p1if.sec02.sec05;

public class C05ForExercise {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 5; 0 < i; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 5; 0 < i; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < 6 - i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 5; 0 < i; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 6 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 5; 0 < i; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                if (count >= 10) {
                    count = 0;
                }
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

        System.out.println();
        int count1 = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                if (count1 >= 10) {
                    count1 = 0;
                }
                System.out.print(count1);
                count1++;
            }
            System.out.println();

        }
    }
}
