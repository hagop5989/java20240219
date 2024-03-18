package ch15.lecture.ex.testgpt;

import java.util.*;

public class test0 {

    //"주어진 정수 배열에서 중복된 값을 제거하고, 오름차순으로 정렬한 결과를 반환하는 메소드를 작성하세요."
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 4, 2, 2, 3, 4, 5, 5, 7};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
