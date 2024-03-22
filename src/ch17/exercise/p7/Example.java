package ch17.exercise.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );
//        ArrayList<String> list2 = new ArrayList<>();
//        for (Member member : list) {
//            if (member.getJob().equals("개발자")) {
//                list2.add(member.getName());
//            }
//        }


        List<Member> developers = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .toList();


        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));

    }
}
