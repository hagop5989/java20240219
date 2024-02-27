package inflearn.java_basic.array.ex.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("입력할 개수를 입력하세요");
            int num = scanner.nextInt();

            int[] array = new int[num];
            int sum = 0;
            double average;

            System.out.println(num + "개의 값을 입력해 주세요");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }

            average = (double) sum / array.length;
            System.out.println("합계: " + sum);
            System.out.println("평균: " + average);
        }
    }
}

