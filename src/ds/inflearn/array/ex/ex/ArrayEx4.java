package ds.inflearn.array.ex.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        //5개의 정수를 입력받아서 정수의 합계와 평균을 계산하는 프로그램
        Scanner scanner = new Scanner(System.in);
        int [] num = new int[5];
        double average;

        while (true) {
        int sum = 0 ;
        System.out.println("값을 입력해 주세요");
        for (int i = 0; i < num.length; i++) {
            num [i] = scanner.nextInt();
            sum += num [i];
        }
        average = (double) sum / 5;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        }
    }
}
