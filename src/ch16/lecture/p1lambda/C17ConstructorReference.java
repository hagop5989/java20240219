package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    C17MyInterface1 obj1 = C17MyClass::new; //() -> new C17MyClass(); 를 축약
    C17MyInterface2 obj2 = C17MyClass::new; // (s, i) -> new C17MyClass(s, i); 를 축약
}

class C17MyClass {
    C17MyClass() {
    }

    C17MyClass(String s, int i) {
    }
}


@FunctionalInterface
interface C17MyInterface1 {
    C17MyClass method(); // C17MyClass 타입을 리턴
}

@FunctionalInterface
interface C17MyInterface2 {
    C17MyClass method(String s, int i);
}
