package ch16.lecture.p1lambda;

import java.util.Arrays;

public class C10Sample {
    public static void main(String[] args) {
        String[] names = {"son", "park", "hwang"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> b.length() - a.length()); // 긴 단어 우선
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> a.length() - b.length()); // 짧은 단어 우선
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1)); // 마지막 단어 기준 짧은단어 먼저
        System.out.println(Arrays.toString(names));
    }
}
