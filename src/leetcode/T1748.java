package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T1748 {
    public static void main(String[] args) {
        int[]nums = {1, 2, 3, 2};

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.get(num);
//            System.out.println("value = " + value);
            if (value == null){
                map.put(num,1);
            } else {
                map.put(num,value +1 );
            }
        }
        int sum = 0;
        for (Integer i : map.keySet()) {
            if(map.get(i) == 1){
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
