package ch16.lecture.p1lambda;

public class C06Lambda {

    C06MyInterface obj1 = (a) -> {
        System.out.println(a);
        System.out.println("C06Lambda.main");
    };

    C06MyInterface obj2 = a -> {
        System.out.println(a);
        System.out.println("C06Lambda.main");
    };
}

@FunctionalInterface
interface C06MyInterface {
    void method(int a);
}

// 1. 매개변수가 있고 리턴이 없는 추상 메소드 consumer
// 2. 매개변수가 1개 있고 리턴이 없는 추상 메소드
// 3. 매개변수가 없고 리턴이 없는 추상메소드=
// 4. 리턴있는 추상 메소드
