package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list5 = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for (int i = 1; i <= numRows; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for (int n = 1; n < prev.size(); n++) {
                int sum = prev.get(n) + prev.get(n - 1);
                next.add(sum);
            }
            next.add(1);
            list5.add(prev);
            prev = next;
        }
        System.out.println(list5);
    }

}



