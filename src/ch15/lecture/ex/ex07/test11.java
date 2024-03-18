package ch15.lecture.ex.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test11 {
    public static void main(String[] args) {


        int rowIndex = 3;
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1);


        for (int i = 1; i < rowIndex; i++) {
            for (int j = 0; j < i; j++) {
                list1.add(1);
            }
        }
        System.out.println(list1);


    }

}

