package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a instanceof A); //
        System.out.println(a instanceof B); //
        System.out.println(a instanceof C); //
        System.out.println(a instanceof D); //
        System.out.println(a instanceof E); //
        System.out.println(a instanceof F); //
    }
}

// @formatter: off -> 여기서부터는 코드 포메팅 안함.
class A {
}

class B extends A {
}

class D extends B {
}

class E extends B {
}

class C extends A {
}

class F extends C {
}
// @formatter: on
