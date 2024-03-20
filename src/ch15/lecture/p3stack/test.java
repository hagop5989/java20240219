package ch15.lecture.p3stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int n = 12;
        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int u = 1; u <= n; u++) {
            if (n % u == 0)
                set.add(u);
        }
        System.out.println(set);

        for (i = 1; i < n; i++) {
            for (j = 1; j < n; j++) {
                if (n == j * (i * i)) {
                    System.out.println(j);
                }
            }
        }


    }
}
