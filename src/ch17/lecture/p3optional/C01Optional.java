package ch17.lecture.p3optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {
        // Optional
        // null이 아닌 값을 포함할 수 있는 컨테이너
        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(3);
        Optional<Double> d = Optional.of(3.14);
        // Optional<Double> o = Optional.of(null); // x

        Optional<Object> container1 = Optional.empty();

        // 값이 있는 지?
        boolean b1 = s.isPresent();
        boolean b2 = container1.isPresent();
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        // 값이 없는 지?
        boolean b3 = s.isEmpty();
        boolean b4 = container1.isEmpty();
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        // 값이 꺼내기
        String s1 = s.get();
        Integer i1 = i.get();
        Double d1 = d.get();
        // Object o = container1.get(); // x 없는데서 꺼낼 수 없음 // if문과 조합해서 있는 경우만 뽑거나 기본값 지정필요

        // 값이 없을 때 꺼내기
        String s2 = s.orElse(""); // java
        Integer i2 = i.orElse(0); // 3
        Object o2 = container1.orElse(new Object()); // 새 객체
        System.out.println("s2 = " + s2);
        System.out.println("i2 = " + i2);
        System.out.println("o2 = " + o2);


        // 값이 없을 때 꺼내기

        System.out.println("C01Optional.main");
    }
}
