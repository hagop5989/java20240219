package ch12.lecture.p3regex;

public class C06BeginEnd {
    public static void main(String[] args) {
        // ^ (caret) : 시작
        // $ : 끝

        String s1 = ",,abc,def,,,xyz,,,";
        String s = s1.replaceAll(",+", ""); // ,가 1개이상인 것으로 빈스트링으로 바꾸겠다
        System.out.println("s = " + s);

        String s2 = s1.replaceAll("^", "hi"); // 시작부분에 hi라고 넣겠다
        System.out.println(s2);

        String s3 = s1.replaceAll("^,+", "");
        System.out.println("s3 = " + s3);

        String s4 = s1.replaceAll("$", "hello");
        System.out.println("s4 = " + s4);

        String s5 = s1.replaceAll(",+$", "");
        System.out.println("s5 = " + s5);

    }
}
