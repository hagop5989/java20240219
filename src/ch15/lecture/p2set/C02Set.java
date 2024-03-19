package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        // 전체 탐색
        // 향상된 for 문
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("spring");
        System.out.println("$$$ 향상된 for");
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("### for each");
        set.forEach(System.out::println);

        // Iterator 사용
        // 주요 메서드 :
        // hasNext 탐색할 아이템이 있는지? (boolean 리턴)
        // next 다음 아이템 리턴
        Iterator<String> iterator = set.iterator();// 반복하여 사용
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
