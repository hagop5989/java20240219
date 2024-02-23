package ch04.lecture.p1if.sec02;

import java.util.Random;
import java.util.Scanner;

public class C05Random_1 {
    public static void main(String[] args) {
        String[] choices = {"가위", "바위", "보"};

        while (true) {
            System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요:");
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt() - 1; // 사용자 입력값에 1을 뺀다.

            Random random = new Random();
            int comChoice = random.nextInt(3); // 0, 1, 2 중 하나를 랜덤으로 선택

            System.out.println("사용자 선택: " + choices[userChoice]);
            System.out.println("컴퓨터 선택: " + choices[comChoice]);

            // 사용자와 컴퓨터의 선택을 비교하여 결과 출력
            if (userChoice == comChoice) {
                System.out.println("비겼습니다.");
            } else if ((userChoice + 1) % 3 == comChoice) {
                System.out.println("패배했습니다.");
            } else {
                System.out.println("승리했습니다.");
            }
        }
    }
}
