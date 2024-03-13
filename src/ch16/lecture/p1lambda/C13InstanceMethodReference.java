package ch16.lecture.p1lambda;

import java.util.List;

public class C13InstanceMethodReference {
    public static void main(String[] args) {
        //인스턴스 메소드 레퍼런스
        C13OtherClass obj1 = new C13OtherClass();
        C13MyInterface lambda1 = (i, j) -> obj1.someMethod(i, j); // 위를
        C13MyInterface lambda2 = obj1::someMethod; // 이렇게 줄일 수 있다.

        List.of(9, 10, 3, 23, 7)
                .forEach(x -> System.out.println(x)); // 똑같이 x를 쓰는 경우 아래처럼 바꿀 수 있다.

        List.of(9, 10, 3, 23, 7)
                .forEach(System.out::println); // 바뀜

    }
}

class C13OtherClass {
    void someMethod(int a, int b) {
        System.out.println("어떤일을 함....");
    }
}

@FunctionalInterface
interface C13MyInterface {
    void method(int x, int y);

}
