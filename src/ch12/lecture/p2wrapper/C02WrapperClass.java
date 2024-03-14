package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; // autoboxing
//        Long e = c; // 안됨. 다형성 문제
//        Long d = a; // 안됨. 다형성 문제

        Number e = a;
        Object f = a;

    }
}
