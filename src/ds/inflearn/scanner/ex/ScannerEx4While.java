package ds.inflearn.scanner.ex;

import java.util.Scanner;

public class ScannerEx4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("구구단의 단 수를 입력해주세요.");
            int n = scanner.nextInt();
            for (int i = n; n == i; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
        }
    }
}
