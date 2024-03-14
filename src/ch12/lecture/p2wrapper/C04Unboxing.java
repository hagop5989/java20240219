package ch12.lecture.p2wrapper;

public class C04Unboxing {
    public static void main(String[] args) {
        Integer a = 3; // auto boxing
        int c = a.intValue(); // 오래전 unboxing
        int b = a; // 현재 auto unboxing

        Long d = 5L;
        long e = d; // auto
        double f = e; // 기본타입 형변환
        double g = d; // auto unboxing + 기본타입 형변환

        Integer h = null;
        int i = h; // auto unboxing , 문법상 문제없어보임. 그러나 int는 기본타입이라 null값이 없음. 오류 발생(nullpointer..)

        System.out.println("실행 종료");

    }
}
