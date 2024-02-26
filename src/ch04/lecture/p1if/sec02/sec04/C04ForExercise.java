package ch04.lecture.p1if.sec02.sec04;

public class C04ForExercise {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
         */
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*
        1
        2
        3
        4
        5
         */
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        /*
        0
        2
        4
        6
        8
         */
        System.out.println();
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        /*
        2
        4
        6
        8
        10
         */
        System.out.println();
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        /*
        4
        3
        2
        1
        0
         */
        System.out.println();
        for (int i = 5; i > 0; --i) {
            System.out.println(i);
        }

        /*
        5
        4
        3
        2
        1
         */
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }


    }
}

