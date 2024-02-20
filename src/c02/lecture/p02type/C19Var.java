package c02.lecture.p02type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C19Var {
    public static void main(String[] args) {
        // var : 변수의 타입을 추론, 따라서 변수의 선언과 할당을 동시에 해야함.

        int a = 10;
//        var a = 10; // b는 int로 추론됨

        String c = "hello";
        var d = "hi"; // d는 String으로 추론됨

        double e = 3.14;
        var f = 3.14; // f 는 double로 추론됨

        int g;
        g = 100;

        // 정수형 literal은 int
        var i = 100;

        var j = 3.14;

        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        List<Map<String, Integer>> list2 = new ArrayList<>();
        var list3 = new ArrayList<Map<String, Integer>>();

    }
}
