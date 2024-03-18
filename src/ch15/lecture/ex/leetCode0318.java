package ch15.lecture.ex;

import java.util.List;

public class leetCode0318 {
    // 배열 탐색 - 최고값 찾기
    // 배열 탐색해서 각아이템과 extra candies 더한값이 최고값
    public static void main(String[] args) {


    }

    public boolean[] kidWithCandies(int[] candies, int extraCandies) {

        int[] candies1 = {1, 2, 3, 4, 5};
        boolean[] cadies1tf = new boolean[candies1.length];
        int extraCandies1 = 3;
        int max = 0;
        boolean temp = false;
        for (int i : candies1) {
            if (i > max) {
                max = i;
                System.out.println("max = " + max);
            }
        }
        for (int j : candies1) {
            if ((j + extraCandies1) > max) {
                temp = true;
            } else {
                temp = false;
            }
        }

        for (int i = 0; i < candies1.length; i++) {
            cadies1tf[i] = temp;
        }

        return cadies1tf;

    }
}
