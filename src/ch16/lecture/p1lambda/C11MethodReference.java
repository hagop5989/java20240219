package ch16.lecture.p1lambda;


// 메소드 참조

// 1. static method 참조
// 2. instance method 참조
// 3. 임의 객체의 메소드 참조
// 4. 생성자 참조


// 1. static method 참조
public class C11MethodReference {
    public static void main(String[] args) {
        //파라미터가 그대로 넘어오는 경우라면 이와같이 줄일 수 있다.
        C11MyInterface obj1 = (param1, param2) -> staticMethod(param1, param2); //전환 전
        C11MyInterface obj2 = C11MethodReference::staticMethod; //전환 후
    }


    static void staticMethod(String x, int y) { //파라미터 명이 아닌 타입과 순서가 중요
        System.out.println(x + y);
    }
}

@FunctionalInterface
interface C11MyInterface {
    void method(String a, int b);
}
