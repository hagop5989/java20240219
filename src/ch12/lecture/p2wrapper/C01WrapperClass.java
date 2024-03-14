package ch12.lecture.p2wrapper;

public class C01WrapperClass {
    public static void main(String[] args) {
        // 기본 타입 8개를 감싼 참조타입(클래스) 8개
        // byte, short, int, long, float, double, boolean, char
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        int a = 3;
        Integer b = a; // x 원래 안됨
        // 저장방식이 다름 int는 그냥 값, Integer는 참조값(x001..)

        // boxing
        Integer c = Integer.valueOf(a);// 오래전...
        Integer b1 = a; // 현재 auto boxing

        long d = 5;
        Long e = d; // 현재 auto boxing

        double f = 3.14;
        Double g = f; // 현재 auto boxing

        char h = '가';
        Character i = h; // 현재 auto boxing

        boolean j = true;
        Boolean k = j; // 현재 auto boxing

    }
}
