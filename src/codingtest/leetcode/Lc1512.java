package codingtest.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lc1512 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        long sum = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .values()
                .stream()
                .mapToLong(v -> v * (v - 1) / 2)
                .sum();


        System.out.println("sum = " + sum);


    }
}
