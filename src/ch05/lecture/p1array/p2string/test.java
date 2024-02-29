package ch05.lecture.p1array.p2string;

public class test {
    public static void main(String[] args) {
        // String은 == 로 비교하면 안되는 이유
        // String pool 내에서 문자열 리터럴은 단 1개만 존재 - JVM 규칙
        // String에서 new를 사용하여 인스턴스를 생성하지 않은이상 인스턴스는 1개만 존재하고 그 안에서 동일한 문자열 리터럴은 1개만 존재
        String str1 = "java";
        String str2 = "java";

        boolean a = (str1 == str2);
        System.out.println(a); // str1 <-> str2 참조값(주소) 비교 / true
        System.out.println(str1.equals(str2)); // str1 <-> str2 문자열 비교 / true

        String str3 = new String("java");
        String str4 = new String("java");

        boolean b = (str3 == str4);
        System.out.println(b); // str3 <-> str4 참조값 (주소) 비교 / false
        System.out.println(str3.equals(str4)); // str3 <-> str4 문자열 비교 / true


    }
}
