package codingtest.gptquiz;

import java.util.*;

public class Q2Collection {
    public static void main(String[] args) {
        // 주어진 배열
        // 결과 목표

        // {"apple", 3}, {"banana", 2}, {"orange", 1}
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "apple"};
        List<String> list = new ArrayList<>();
        for (String s : list) {
            list.add(s);
        }
        long count = list.stream()
                .distinct()
                .count();


        System.out.println("count = " + count);

    }
}
