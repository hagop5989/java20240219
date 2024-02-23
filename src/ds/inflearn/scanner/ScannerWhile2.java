package ds.inflearn.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1번째 숫자와 2번째 숫자 0을 모두 입력하면 프로그램을 종료합니다");
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요");
            int a = scanner.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("두 값이 모두 0이므로 종료합니다.");
                break;
            } else {
                System.out.println("a+b = " + a + b);
            }
        }
    }
}
