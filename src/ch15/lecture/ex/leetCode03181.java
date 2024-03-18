package ch15.lecture.ex;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode03181 {
    // 배열 탐색 - 최고값 찾기
    // 배열 탐색해서 각아이템과 extra candies 더한값이 최고값
    public static void main(String[] args) {
        int max = 0;
        int extraCandies = 3;
        boolean[] tf = new boolean[5];
        List<Integer> candies1 = new ArrayList<>();


        candies1.add(1);
        candies1.add(2);
        candies1.add(3);
        candies1.add(4);
        candies1.add(5);
        System.out.println(candies1.indexOf(2));
        for (Integer i : candies1) {
            if (i > max) {
                max = i;
            }
        }
        for (int i = 0; i < candies1.size(); i++) {
            if (candies1.get(i) + extraCandies >= max) {
                tf[i] = true;
            } else {
                tf[i] = false;
            }
        }
        System.out.println(Arrays.toString(tf));

    }
}

//    public boolean[] kidWithCandies(int[] candies, int extraCandies) {
//
//
//
//}
