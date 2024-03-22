package ch17.exercise.p5;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "java", "lambda", "java8"
        );
        list.stream()
                .filter(s -> s.matches(".*[jJ][Aa][Vv][Aa]*."))
                .forEach(System.out::println);
        System.out.println();


        long count = list.stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .count();

        System.out.println(count);
    }
}
