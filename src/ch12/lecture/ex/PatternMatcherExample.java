package ch12.lecture.ex;

public class PatternMatcherExample {
    public static void main(String[] args) {
//        String id = "5Angel1004";
        String id = "aAngel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{8,12}"; // 첫번째는 알파벳 시작, 두번째부터 숫자와 알파벳으로 구성된 8-12자 사이
        boolean isMatch = id.matches(regExp);

        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
