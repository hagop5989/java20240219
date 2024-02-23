package ch04.lecture.p1if.sec02;

import java.util.Random;
import java.util.Scanner;

public class C05Random {
    public static void main(String[] args) {
        while (true) {
            System.out.println("가위(1~2), 바위(3~4) , 보(5~6)를 입력하세요");
            Scanner scanner = new Scanner(System.in);
            int user = scanner.nextInt();

            String com = "null";
            Random random = new Random();
            int dice1 = random.nextInt(1, 7); //가위, 바위, 보

//        컴퓨터 부분
            if (dice1 <= 2) {
                com = "가위";
            } else if (dice1 <= 4) {
                com = "바위";
            } else if (dice1 <= 6) {
                com = "보";
            }
            System.out.println("사용자 선택: " + user);
            System.out.println("컴퓨터 선택: " + com);

//        유저부분
// 1~2: 가위 , 3~4: 바위, 5~6: 보
            if (user <= 2) {
                switch (com) {
                    case "바위" -> System.out.println("패배했습니다.");
                    case "보" -> System.out.println("승리했습니다.");
                    default -> System.out.println("비겼습니다.");
                }
            } else if (user <= 4) {
                switch (com) {
                    case "보" -> System.out.println("패배했습니다.");
                    case "가위" -> System.out.println("승리했습니다.");
                    default -> System.out.println("비겼습니다.");
                }
            } else if (user <= 6) {
                switch (com) {
                    case "가위" -> System.out.println("패배했습니다.");
                    case "바위" -> System.out.println("승리했습니다.");
                    default -> System.out.println("비겼습니다.");
                }
            }
        }

    }

}



