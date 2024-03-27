package codingtest;

import java.util.Set;
import java.util.function.*;

public class test {
    public static void main(String[] args) {
//        Function<String,Integer> f = (String s) ->Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100") + 200);

        Supplier<MyClass> s = () -> new MyClass();

        MyClass mc = s.get(); // 객체 반환
        System.out.println(mc);
        System.out.println(s.get());
    }
//    Set add(Object o);

    private static class MyClass {
    }
}