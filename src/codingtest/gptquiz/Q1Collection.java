package codingtest.gptquiz;

import java.util.*;

public class Q1Collection {
    public static void main(String[] args) {
        // 각 문자열의 길이를 기준으로 문자열을 분류하고, 그 결과를 맵으로 반환하는 자바 프로그램을 작성하십시오.
        // 맵의 키는 문자열의 길이이고, 값은 해당 길이를 가진 모든 문자열의 리스트입니다.

        // 제시
        // List<String> strings = Arrays.asList("Java", "Python", "C", "JavaScript", "Kotlin");

        //결과
        //결과 맵은 다음과 같아야 합니다:
        //길이가 4인 문자열 리스트: ["Java", "Kotlin"]
        //길이가 1인 문자열 리스트: ["C"]
        //길이가 6인 문자열 리스트: ["Python"]
        //길이가 10인 문자열 리스트: ["JavaScript"]

        List<String> strings = Arrays.asList("Java", "Python", "C", "JavaScript", "Kotlin");
        Map<Integer,List<String>> map = new HashMap<>();
        for (String s : strings) {
            int length = s.length();
            List<String> list = map.get(length);
            if(list == null) {
                list = new ArrayList<>();
                map.put(length, list);
            }
            list.add(s);
        }
        System.out.println(map); // 답변
    }
}
