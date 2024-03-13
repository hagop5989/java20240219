package ch16.lecture.p1lambda;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "abce";
        strings[1] = "abcd";
        strings[2] = "cdx";
        int n = 1;
        System.out.println(Arrays.toString(strings));
//        Arrays.sort(strings, (a, b) -> {
//            if (a.charAt(n) == b.charAt(n)) {
//                return a.compareTo(b); // n번째 문자가 같다면 전체 문자열을 사전순으로 정렬
//            } else {
//                return a.charAt(n) - b.charAt(n); // n번째 문자를 기준으로 정렬
//            }
//        });

        Arrays.sort(strings, (a, b) -> a.charAt(n) == b.charAt(n) ? a.compareTo(b) : (a.charAt(n) - b.charAt(n)));


        System.out.println(Arrays.toString(strings));
    }

    ;
}
