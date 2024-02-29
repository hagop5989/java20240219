package ch05.lecture.p1array.p2string;

public class C04CharAt {
    public static void main(String[] args) {
        // 첫번째 (index 0) s
        // 두번째 (index 1) o
        // 세번째 (index 2) n
        String a = "son";
        //각 인덱스에 있는 문자를 얻어내고 싶을때 사용
        System.out.println(a.charAt(0)); // s
        System.out.println(a.charAt(1)); // o
        System.out.println(a.charAt(2)); // n

        // char 타입 리턴

        String b = """
                hello
                world
                """;
        System.out.println(b.charAt(0)); // h
        System.out.println(b.charAt(b.length() - 1)); // 빈칸
    }
}
