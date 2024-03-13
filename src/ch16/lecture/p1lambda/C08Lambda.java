package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> {
            System.out.println("C08Lambda.method");
            System.out.println("C08Lambda.method");
        };
        //매개변수와 리턴이 없을 때
        C08MyInterface obj2 = () -> System.out.println("hello");
    }
}

@FunctionalInterface
interface C08MyInterface {
    void method();
}


// 3. 매개변수가 없고 리턴이 없는 추상메소드

