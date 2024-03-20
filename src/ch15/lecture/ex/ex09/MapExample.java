package ch15.lecture.ex.ex09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수 받은 아이디 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        // 코드작성

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int score = entry.getValue();
            totalScore += score;

            if (score > maxScore) {
                maxScore = score;
                name = entry.getKey();
            }
        }

        System.out.println("평균 점수  :" + totalScore / entries.size());
        System.out.println("최고 점수  :" + maxScore);
        System.out.println("최고 점수 id :" + name);

    }
}
