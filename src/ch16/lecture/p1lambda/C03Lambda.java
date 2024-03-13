package ch16.lecture.p1lambda;

public class C03Lambda {
    public static void main(String[] args) {
        C04Myinterface obj = (int a, int b) -> {
            System.out.println(a + b);
            System.out.println("메소드 몸체");
        };
        C04Myinterface obj2 = (a, b) -> {
            System.out.println(a * b);
            System.out.println("lambda main");
        };
        C04Myinterface obj3 = (a, b) -> System.out.println();

    }
}


// 람다 작성 방법들
// 1. 매개변수가 있고 리턴이 없는 추상 메소드 consumer
// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
// 3. 매개변수가 없고 리턴이 없는 추상메소드=
// 4. 리턴있는 추상 메소드


interface C04Myinterface {
    void method(int a, int b);
};