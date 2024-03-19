package ch15.lecture.ex;

import ch15.lecture.ex.ex08.Student;

import java.util.*;

public class test0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);

        int[] a = new int[list.size()];
        a[0] = list.get(0);
        for (int i = 0, j = 0; i < list.size() - 1; i++, j++) {
            if (a[i - 1] != a[i]) {
                a[i] = list.get(j);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
