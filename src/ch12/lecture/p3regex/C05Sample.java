package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // 변수명 규칙
        // _, $, 영문 대소문자, 숫자 조합
        // 단 숫자로 시작하면 안됨
        String a = "[^0-9][_$a-zA-Z0-9]{0,1}";
        System.out.println("aBC01".matches(a));
    }
}
