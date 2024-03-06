package ch06.lecture.p6final;

public class C02Final {
    public static void main(String[] args) {
        method1(3);
        method1(5);
    }

    static void method1(int i) {
        i = 10;
    }

    // final이 파라미터 사용시 이렇게 동작함.
    static void method2(final int j) {
//        j = 50; // 안됨, 메소드 호출시 이미 할당 받음. 메소드 호출시 할당받음

    }
}
