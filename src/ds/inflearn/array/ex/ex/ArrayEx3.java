package ds.inflearn.array.ex.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("값을 입력해 주세요");
        for (int i = 0 ; i< numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 4; 0 <= i ; i--){
            System.out.print(numbers[i]);
            if ( 0 < i ) {
                System.out.print(", ");
            }
        }

    }
}
