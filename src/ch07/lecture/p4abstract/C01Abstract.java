package ch07.lecture.p4abstract;

public class C01Abstract {
    C01Animal a1 = new C01Tiger();
    C01Animal b1 = new C01Cat();
    // 추상 클래스로 인스턴스 생성 불가
    // 실제로 사용하는 용도가 아닌 추상적 개념의 용도로만 쓰는 경우 앞에 abstract 붙임
//    C01Animal c1 = new C01Animal();
}

// @formatter: off
abstract class C01Animal {
}

class C01Tiger extends C01Animal {
}

class C01Cat extends C01Animal {
}



