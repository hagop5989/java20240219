package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식 : 특정 규칙의 문자열 표현을 위한 문자열 패턴

        // 한 문자
        String pattern1 = "a";
        boolean b1 = "a".matches(pattern1); // true
        System.out.println("b1 = " + b1);

        System.out.println("b".matches(pattern1)); // b라는 문자는 a라는 문자 패턴과 일치하지 않는다
        System.out.println("aa".matches(pattern1)); // aa라는 문자는 a라는 문자 패턴과 일치하지 않는다 (a 1개만 적혀야함)
        System.out.println("aa".matches("aa")); // true
        System.out.println("ab".matches("ba")); // false

        // 주의점
        System.out.println("\\".matches("\\\\")); // \ true 한개를 표현하려면 \\ 두개를 써야함.
        // regex . : 모든문자를 뜻함 (regex에서 점(.))
        System.out.println(".".matches(".")); // true
        System.out.println("a".matches(".")); // true
        System.out.println("C".matches(".")); // true
        System.out.println("9".matches(".")); // true
        System.out.println("abc".matches(".")); // false, 모든문자 한개만 됨

        System.out.println(".".matches("\\."));

        // 대소문자 구별함
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("A")); // false
        System.out.println("A".matches("A")); // false

    }
}
