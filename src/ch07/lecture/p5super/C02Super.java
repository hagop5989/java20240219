package ch07.lecture.p5super;

public class C02Super {
    C02Parent parent = new C02Parent(); // 생성자를 사용해서 인스턴스 만들음
    C02Child child = new C02Child();
}

class C02Parent {
    // 생성자 : 객체가 만들어질 때 초기화 하는 코드들 (필드 초기화)
    public C02Parent() {
    }
}

class C02Child extends C02Parent {
    public C02Child() {
        // 상위 타입 생성자 호출 - 꼭 해야함.
        // 상위 타입의 no-args 생성자 호출 코드는 자동으로 삽입.
        super(); // 이 코드에선 쓰거나 안쓰거나 똑같음
    }
}