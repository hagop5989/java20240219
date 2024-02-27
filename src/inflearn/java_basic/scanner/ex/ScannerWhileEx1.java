package inflearn.java_basic.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료)");
            String name = scanner.nextLine();
            System.out.println("나이를 입력하세요 (종료를 입력하면 종료)");
            String age = scanner.nextLine();
            if (name == "종료" || (String) age == "종료") {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 이름: " + name + " , 나이: " + age);
        }
    }
}
