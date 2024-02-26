package ch04.lecture.p1if.sec02.sec04;

import java.util.Scanner;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("단 수를 입력해 주세요 :");
            int input = scanner.nextInt();

            for (int m = input; m <= input; m++) {
                System.out.println(STR."*** \{m} 단 ***");
                for (int n = 1; n <= 9; n++) {
                    System.out.println(STR."\{m} x \{n} = \{m * n}");
                }
            }
        }
    }
}
