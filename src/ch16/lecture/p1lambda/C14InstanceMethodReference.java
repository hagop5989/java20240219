package ch16.lecture.p1lambda;

// 3. 임의 객체의 메소드 참조
// 인스턴스 메소드 인데 스테틱 처럼 작성이 됨
public class C14InstanceMethodReference {
    public static void main(String[] args) {
        C14OtherClass obj1 = new C14OtherClass();
        C14MyInterface lam1 = (a, b) -> a.someMethod(b); // 첫번째 파라미터의 객체에 두번째 파라미터가 해당 객체의 메소드의 파라미터가 될때, b는 숫자 상관없이 순서만 맞게 들어가면 됨
// 3. 임의 객체의 메소드 참조
        C14MyInterface lam2 = C14OtherClass::someMethod; // 이와같이 변환 가능.

    }
}

class C14OtherClass {
    void someMethod(int x) {
        System.out.println("어떤일을 함..");
    }
}

@FunctionalInterface
interface C14MyInterface {
    void method(C14OtherClass obj, int x); //추상메서드의 첫번째 타입이 다른클래스 타입
}
