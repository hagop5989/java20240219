package ch12.lecture.p2wrapper;

public class C05Compare {
    public static void main(String[] args) {
        int a = 60_000;
        int b = 60_000;

        System.out.println(a == b); // true

        Integer c = 70_000; // auto boxing
        Integer d = 70_000; // auto boxing

        System.out.println(c == d); // false -> 참조값 끼리 비교
        System.out.println(c + 1 == d + 1); // true -> +1 때문에 int로 AutoUnboxing 되고 int형태로 비교됨

        //**************************
        //참조타입 비교는 equals 사용!!
        //**************************
        System.out.println(c.equals(d)); // true
    }
}
