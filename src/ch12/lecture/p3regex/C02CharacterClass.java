package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자 집합, "[]" 로 적음
        System.out.println("a".matches("[abc]")); // true
        System.out.println("b".matches("[abc]")); // true
        System.out.println("c".matches("[abc]")); // true
        System.out.println("A".matches("[abc]")); // false - 대소문자 구별함

        System.out.println("abc".matches("[abc]")); // false - a or b or c 로 인식

        String p1 = "[abc][abc][abc]"; // 첫번째 글자 abc중 하나, 두번째 글자 abc중 하나, 세번째 글자 abc중 하나
        System.out.println("abc".matches(p1)); // true
        System.out.println("bac".matches(p1)); // true
        System.out.println("cab".matches(p1)); // true
        System.out.println("ccc".matches(p1)); // true
        System.out.println("bbb".matches(p1)); // true
        System.out.println("aaa".matches(p1)); // true

        String p2 = "[a-z]"; // a부터 z 까지
        System.out.println("a".matches(p2)); // true
        System.out.println("s".matches(p2)); // true
        System.out.println("z".matches(p2)); // true
        System.out.println("A".matches(p2)); // false
        System.out.println("Z".matches(p2)); // false
        System.out.println("1".matches(p2)); // false

        String p3 = "[a-zA-z]"; // 대소문자 a-z까지 -> [abc...ABC..Z] 적은 것과 같다
        System.out.println("s".matches(p3)); // true
        System.out.println("S".matches(p3)); // true

        String p4 = "[a-zA-Z0-9]"; // 숫자 0-9까지 표현가능
        String p5 = "[가-힣]"; // 한글 한글자 - 마지막 한글 유니코드가 힣 임

        String p6 = "[^abc]"; // abc 빼고(^) -a,b,c 외 한글자
        System.out.println("a".matches(p6)); // false
        System.out.println("c".matches(p6)); // false
        System.out.println("d".matches(p6)); // true
        System.out.println("A".matches(p6)); // true
        System.out.println("8".matches(p6)); // true
        System.out.println("gty".matches(p6)); // false

    }
}
