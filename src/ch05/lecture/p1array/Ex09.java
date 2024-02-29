package ch05.lecture.p1array;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int menu = 0;
        int studentNum = 0;
        int[] scores = null;
        int scoreSum = 0;
        double avg = 0;
        int max = 0;
        boolean run = true;

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("선택> 1");
                    System.out.println("학생 수를 입력해주세요.");
                    studentNum = scanner.nextInt();
                    scores = new int[studentNum];
                    System.out.println("학생수: " + scores.length);
                }
                case 2 -> {
                    System.out.println("선택> 2");
                    System.out.println("점수를 입력해 주세요.");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]" + " : ");
                        scores[i] = scanner.nextInt();
                    }
                }
                case 3 -> {
                    System.out.println("선택> 3");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores" + "[" + i + "]: " + scores[i]);
                    }
                }

                case 4 -> {
                    System.out.println("선택> 4");
                    for (int i = 0; i < scores.length; i++) {
                        scoreSum += scores[i];
                        if (max <= scores[i]) {
                            max = scores[i];
                        }
                    }
                    avg = scoreSum / scores.length;
                    System.out.println("최고점수: " + max);
                    System.out.println("평균점수: " + avg);
                }
                case 5 -> {
                    System.out.println("선택> 5");
                    System.out.println("프로그램 종료");
                    run = false;
                }
                default -> System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }

        }

        //2 선택 시  85, 95, 93

    }
}
