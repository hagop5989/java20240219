package ch09.lecture.p2anonymous;

import java.util.Scanner;

public class C07Sample {
    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            double value = Math.random() * 3 + 1;
            int value2 = (int) value;
            Scanner scanner = new Scanner(System.in);
            System.out.print("가위: 1, 바위: 2, 보: 3 숫자로 입력하세요. 선택: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("사용자 선택: " + userInput);

            if (userInput - (value2) == 0) {
                System.out.println("비겼습니다.");
                System.out.println("컴퓨터: " + value2);
            } else {
                switch (value2) {
                    case 1 -> {
                        System.out.println("컴퓨터: 가위(1)");
                        if (userInput - (value2) == 1) {
                            System.out.println("사용자: 바위");
                            System.out.println("사용자 승리");
                        } else {
                            System.out.println("컴퓨터 승리");
                        }
                    }
                    case 2 -> {
                        System.out.println("컴퓨터: 바위(2)");
                        if (userInput - (value2) == 1) {
                            System.out.println("사용자: 보");
                            System.out.println("사용자 승리");
                        } else {
                            System.out.println("컴퓨터 승리");
                        }
                    }
                    case 3 -> {
                        System.out.println("컴퓨터: 보(3)");
                        if (userInput - (value2 % 3) == 1) {
                            System.out.println("사용자: 가위");
                            System.out.println("사용자 승리");
                        } else {
                            System.out.println("컴퓨터 승리");
                        }
                    }
                }
            }


        }


        // TODO : null 대신 익명클래스 객체 코드 작성
//        Game rpsGame = new Game() {
//
//
//        };
//        rpsGame.play(); // 가위,바위,보 중 하나 출력
//
//        Game lottoGame = null;
//        // 초보: 1~45 값 중 하나 출력
//        // 중급: 1~45 값 중 6개 (중복없이) 출력
//        lottoGame.play();
    }
}
