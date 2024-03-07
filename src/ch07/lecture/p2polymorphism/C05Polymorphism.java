package ch07.lecture.p2polymorphism;

public class C05Polymorphism {
    // 어디서든지 b,c 에서 a로 넣을 수 있따.
    // 파라미터든 지역변수든 필드든 참조변수에 넣을 수 있다.
    // 실행할땐 실제 인스턴스 메서드가 실행

    A a;

    C05Polymorphism() {
        a = new A(); // ok
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();
    }

    public static void main(String[] args) {
        //지역변수
        A a = new A();
        a.method1();
        a = new B();
        a.method1();
        a = new C();
        a.method1();

        method(new A());
        a.method1();
        method(new B());
        a.method1();
        method(new C());
        a.method1();

    }

    public static void method(A a) {

    }
}

class A {
    public void method1() {
        System.out.println("A.method");
    }
}

class B extends A {
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
    public void method1() {
        System.out.println("C.method1");
    }
}