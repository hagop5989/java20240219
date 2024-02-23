package ch04.lecture.p1if.sec02.p2switch;

public class C08SwitchExpression {
    public static void main(String[] args) {
        String city = "미국"; // 파리, 런던, 도쿄

        String area = switch (city) {
            case "서울", "도쿄" -> "아시아";
            case "런던", "파리" -> "유럽";
            default -> "기타 지역";
        };
        System.out.println("area = " + area);

//        아래는 심화버전

        System.out.println(city + "는 " + switch (city) {
            case "서울", "도쿄" -> "아시아";
            case "런던", "파리" -> "유럽";
            default -> "기타 지역";
        } + "에 있습니다.");
    }
}
