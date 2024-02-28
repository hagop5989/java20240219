package ch05.lecture.p1array;

import java.util.Arrays;

public class Ex08Stream {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();

        long cnt = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .count();
        System.out.println("sum: " + sum);
    }
}
