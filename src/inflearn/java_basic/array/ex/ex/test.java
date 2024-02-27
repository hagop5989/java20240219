package inflearn.java_basic.array.ex.ex;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //사용자로부터 4명 학생의 국어,수학,영어,점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램
        Scanner scanner = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subject = {"국어", "수학", "영어"};
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < 3; j++) {
                System.out.println(subject[j] + " 점수:");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            average = sum / subject.length;
            System.out.println((i) + "번 학생의 총점:" + sum + " 평균: " + average);
        }
    }
}