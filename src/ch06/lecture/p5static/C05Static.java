package ch06.lecture.p5static;

public class C05Static {
    // static 필드 (class 변수)
    static int age;
    static double area; // 몇개의 statement가 있다고 가정

    // static block
    // static 멤버 초기 설정용
    // static 멤버 초기화에 여러 줄이 필요한 경우 이렇게 사용 가능.
    static {
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        System.out.println("statement ...");
        area = Math.PI * 10 * 10; //
    }

    // 생성자
    // 인스턴스 메소드
    // static 메소드(class 메소드)

    static void method1() {

    }
}

