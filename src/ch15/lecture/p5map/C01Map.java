package ch15.lecture.p5map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map : entry (key,value) 를 저장
        // 같은 key를 가진 두 개의 entry를 저장할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hypertext markup language");
        map.put("spring", "java framework");
        map.put("react", "frontend library");
        map.put("css", "style sheet"); // 같은 키는 입력안됨


        // map 크기
        System.out.println(map.size()); // 5

        // entry 검색
        boolean b1 = map.containsKey("java");// 주로 key로 검색함. java라는 키가있는지? ->boolean타입 출력 (true)
        boolean b2 = map.containsKey("css");// true
        boolean b3 = map.containsKey("jsp");// false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry 의 value 얻기 - key를 넣어서 value를 얻음
        String value1 = map.get("java");
        String value2 = map.get("react");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        String value3 = map.get("jsp");
        System.out.println("value3 = " + value3); // null, string 아님, 키워드임

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4); //프로그래밍 언어

        if (map.containsKey("css")) { // css라는 키가 있을때만 put 진행
            map.put("css", "스타일 시트");
        }
        if (map.containsKey("jsp")) { // jsp라는 키가 있을때만 put 진행
            map.put("jsp", "java server page");
        }
        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        // entry 삭제 - 키를 찾아서 지움
        System.out.println("map.size() = " + map.size()); // 5
        String value6 = map.remove("css");
        System.out.println("map.size() = " + map.size()); // 4
        String value7 = map.remove("jsp");// 키에 지울게 없음
        System.out.println("map.size() = " + map.size()); // 4
        System.out.println("value6 = " + value6);
        System.out.println("value7 = " + value7); // null


        // 전체탐색
        // 1. keySet - key만 얻으며 결과값이 Set 타입임.
        System.out.println("#### keySet && 향상된 for 활용");
        Set<String> keys = map.keySet();
        // forEach
        // iterator
        // enhanced for
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        // 2. entrySet - Set Map의 entry 타입 반환
        System.out.println("### entrySet && 향상된 for");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // forEach
        // iterator
        // enhanced for
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 3. forEach
        System.out.println("### forEach 메소드 활용");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}

