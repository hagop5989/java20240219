package ds.inflearn.array.ex.ex;

import java.util.Scanner;

public class ArrayEx6 {
    //사용자로부터 n개의 정수를 입력받아서 배열에 저장하고, 가장 작은수와 큰수를 찾아 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 개수를 입력하세요");
        int num = scanner.nextInt();
        int [] array = new int [num];
        int max = 0;
        int min = 0;

        for (int i = 0 ; i < array.length; i++) {
            System.out.println(num + "개의 값을 입력해 주세요");
            array [i] = scanner.nextInt();
            if (i == 0) {
                max = array[i];
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);



}
}
