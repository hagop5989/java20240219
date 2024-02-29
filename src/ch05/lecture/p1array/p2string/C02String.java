package ch05.lecture.p1array.p2string;

public class C02String {
    public static void main(String[] args) {
        //string literal 값 사용시 참조값 같음

        String a = "son";
        String b = "lee";
        String c;
        c = "son";

        System.out.println(System.identityHashCode(a)); // a와 c는 동일
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        String d = new String("son");
        System.out.println(System.identityHashCode(d)); // new 연산자를 써서 새로 공간이 만들어짐

        // 참조값 비교
        System.out.println(a == c); // true
        System.out.println(a == d); // false

        // 내용물 비교
        System.out.println(a.equals(c)); // true
        System.out.println(a.equals(d)); // true

        // String 비교는 equals 사용!!!!
    }
}
