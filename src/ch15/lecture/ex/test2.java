package ch15.lecture.ex;

import java.util.TreeSet;

public class test2 {
    public static void main(String[] args) {
        int trdNum = 0;
        int[] nums = {2, 2, 1, 3, 3};
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int num : nums) {
            treeSet.add(num);
        }

        if (treeSet.size() < 3) {
            System.out.println("최대값: " + treeSet.last());
        } else {
            System.out.println(treeSet);
            int firNum = treeSet.last();
            treeSet.remove(firNum);
            int secNum = treeSet.last();
            treeSet.remove(secNum);
            trdNum = treeSet.last();
            System.out.println("3번째값 :" + trdNum);
        }
    }
}
