package ch15.lecture.ex.testgpt;

import java.util.*;

public class test1 {
    //"주어진 문자열 리스트에서 각 문자열의 길이에 따라 그룹을 만드세요. 같은 길이의 문자열끼리 리스트로 묶고,
    // 이 리스트들을 모아 하나의 맵으로 반환하는 메소드를 작성하세요.
    // 반환되는 맵의 키는 문자열의 길이가 되어야 합니다."

    //예시 입력: ["apple", "bat", "beet", "arm", "car", "dog"]
    //예시 출력: {3=["bat", "arm", "car", "dog"], 4=["beet"], 5=["apple"]}

    public static void main(String[] args) {
        String[] arr1 = {"apple", "bat", "beet", "arm", "car", "dog"};
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : arr1) {
            int length = s.length();
            map.putIfAbsent(length, new ArrayList<>()); // 새로운 리스트 생성
            map.get(length).add(s); // 기존 리스트 사용
        }

        System.out.println(map);

    }
}
