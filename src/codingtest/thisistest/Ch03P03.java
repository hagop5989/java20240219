package codingtest.thisistest;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ch03P03 {
    public static void main(String[] args) {
        // 가장 숫자가 높은 카드 1장을 뽑는 게임
        //N * M 형태 N = 행의 개수, M = 열의 개수
        // 1. 행 선택 후 행 카드 중 가장 숫자 낮은 카드 뽑기
        //이후에 해당 행에서 가장 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑도록 해야한다.
        // 1<= N, M<= 100
        // 첫째 줄에 게임룰에 맞게 선택한 카드에 적힌 수를 출력한다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("n값 입력: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("n값 입력: ");
        int m = Integer.parseInt(scanner.nextLine());

        int [][] arr = new int[n][m];

        List<Integer> list = new ArrayList<>();
        for (int[] ints : arr) {
                int min = ints[0];
                int max = ints[0];
            for (int num : ints) {
                if (num<min) {
                    min = num;
                }
            }
            list.add(min);
        }
        list.sort(Comparator.reverseOrder());
        System.out.println("list = " + list);
        System.out.println("최저 중 최고 값: " + list.get(0));
//        System.out.println("min = " + min);


    }
}
