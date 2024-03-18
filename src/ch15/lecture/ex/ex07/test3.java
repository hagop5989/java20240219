package ch15.lecture.ex.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        int rows = 5;
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                number = number * (i - j) / (j + 1);
                if (number != 0) {
                    a.add(number);
                }
            }
            System.out.println();
            System.out.println(a);
        }
    }

}
