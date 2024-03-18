package ch15.lecture.ex.ex07;

import java.util.*;

public class test0 {
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        int stoneSize = stones.length;
        List<Integer> stoneList = new ArrayList<>();
        for (int stone : stones) {
            stoneList.add(stone);
        }
        while (stoneSize > 1) {
            stoneList.sort((a, b) -> b - a);
            int max1 = stoneList.remove(0);
            int max2 = stoneList.remove(0);
            int dif = max1 - max2;
            if (dif != 0) {
                stoneList.add(dif);
            }
        }
        if (stoneSize == 0) {
            return 0;
        } else {
            return stoneList.getFirst();
        }
    }
}
