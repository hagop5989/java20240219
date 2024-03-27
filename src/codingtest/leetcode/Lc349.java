package codingtest.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Lc349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        for (int i : nums1) list1.add(i);
        for (int i : nums2) list2.add(i);
        if (list1.size() > list2.size()) {
//            list1.contains(list2.)
        }


    }
}
