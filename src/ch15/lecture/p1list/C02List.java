package ch15.lecture.p1list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
    public static void main(String[] args) {
        // List : 데이터의 순서(Index)가 있고 중복 허용 됨
        // List는 인터페이스임

        // 빈 리스트 생성
        List<String> list1 = new ArrayList<>();

        // element (요소, 원소, 아이템) 추가
        list1.add("java"); // index 0
        list1.add("spring"); // index 1
        list1.add("react"); // index 2
        list1.add("css"); // index 3
        list1.add("spring"); // 중복 가능 // index 4
//        list1.add(1);// 안됨 - 위에서 String으로 지정함

        // element 읽기( 얻기 get )
        String s1 = list1.get(2);
        System.out.println("s1 = " + s1);
        String s2 = list1.get(1);
        System.out.println("s2 = " + s2);
        System.out.println(list1.get(4));

        // 검색 (contains)
        System.out.println(list1.contains("spring")); // true;
        System.out.println(list1.contains("java")); // true;
        System.out.println(list1.contains("html")); // false;

        // 삭제 (remove)
        list1.remove("java"); //true
        list1.remove("css"); //true
        list1.remove("html"); // false
        list1.remove("spring"); //true

        // 전체 탐색
        // 고전적 ###for
        System.out.println("고전적 for문");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // 향상된 for
        System.out.println("향상된 for 문");
        for (String item : list1) {
            System.out.println(item);
        }

        // forEach & lambda
        System.out.println("forEach & lambda");
        list1.forEach(System.out::println);

    }
}
