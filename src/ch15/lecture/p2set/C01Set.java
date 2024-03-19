package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 추가 add
        set.add("java");
        set.add("spring");
        set.add("html");
        set.add("react");

        // 크기 size
        System.out.println(set.size()); // 4

        // 원소가 없을때만 추가
        boolean b1 = set.add("css"); // o , true
        boolean b2 = set.add("java"); // x , false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println(set.size()); // 5

        // 검색 contains
        boolean b3 = set.contains("angular");
        boolean b4 = set.contains("java");
        System.out.println("b3 = " + b3); // false
        System.out.println("b4 = " + b4); // true

        // 지우기 remove
        boolean b5 = set.remove("java");
        boolean b6 = set.remove("css");
        System.out.println(set.size()); // 3
        boolean b7 = set.remove("jsp");// x
        System.out.println(set.size()); // 3

        System.out.println("b5 = " + b5); // t
        System.out.println("b6 = " + b6); // t
        System.out.println("b7 = " + b7); // f


    }
}
