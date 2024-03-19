package ch15.lecture.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (set.add(num) == false) {
                System.out.println("중복:" + num);
                list.add(num);
            } else {
                set.add(num);
            }
        }
        System.out.println(list);

    }
}
