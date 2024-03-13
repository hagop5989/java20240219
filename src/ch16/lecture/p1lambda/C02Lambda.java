package ch16.lecture.p1lambda;

public class C02Lambda {
    public static void main(String[] args) {
        C02MyInterface obj = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            System.out.println("C02Lambda");
        };
    }
};


// FunctionalInterface annotation 붙이면 검사가능
// 마크된 인터페이스가 추상 메소드가 하나인지 컴파일러가 검사
@FunctionalInterface
interface C02MyInterface {
    void method1(int a, int b);
}
