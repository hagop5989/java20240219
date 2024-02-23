package ds.inflearn.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구구단의 단 수를 입력해주세요.");
        int n = scanner.nextInt();
        for (int i = n; i == n; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
