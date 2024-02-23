package ch04.lecture.p1if.sec02.p2switch;

public class C09Yield {
    String city = "seoul"; // paris, london, tokyo

    String area = switch (city) {
        // 원래 yield가 들어가야하는데 생략된것. 1개 있을땐 안써도 됨
        // statement가 여러줄일때 yield가 필요
        case "seoul", "tokyo" -> "asia";
        case "paris", "london" -> {
            System.out.println("statement 1");
            System.out.println("statement 2");
            yield "europe"; // 마지막에 존재해야 함.
        }
        default -> "etc";
    };
    int length = 5;
    String shape = "원"; // 원, 정사각형
    double result = switch (shape) {
        case "원" -> {
            double calc = 3.14 * length * length;
            yield calc;
        }
        case "정사각형" -> length * length;
        default -> 0.0;
    };
}
