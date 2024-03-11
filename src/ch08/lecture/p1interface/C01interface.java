package ch08.lecture.p1interface;

public class C01interface {
    public static void main(String[] args) {
        C01ConcreteClass o1 = new C01ConcreteClass();
        C01Myinterface o2 = o1;
    }
}

interface C01Myinterface {
}

class C01ConcreteClass implements C01Myinterface {
}
