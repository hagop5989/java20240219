package ch07.lecture.p4abstract;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal a1 = new C02Fish();
        C02Animal a2 = new C02Cat();
        a1.breathe();
        a2.breathe();

        // C02Animal a3 = new C02Bird() {}; // x 추상클래스 이므로 생성 불가
    }
}

// @formatter:off
abstract class C02Animal{
    // abstract method : 몸통(body) 없는 메소드
    // 하위 클래스가 꼭 재정의 해야함 (안하면 오류)
    // 추상 메소드가 있다면 클래스는 꼭 추상 클래스
    abstract public void breathe(); // 기능이 있다는 것만 알리고 구현은 하위에서 재정의하여 실행
}

// 구현 클래스 (concrete class)
class C02Fish extends C02Animal {
    @Override public void breathe() {
    System.out.println("아가미로 호흡합니다.");
    }
}
class C02Cat extends C02Animal {
    @Override public void breathe() {
    System.out.println("폐로 호흡합니다.");
    }
}

// 자식 클래스가 추상 메소드를 재정의하지 않으면
// 추상 클래스가 되어야만 함 (추상 메소드를 상식받았으므로)
abstract class C02Bird extends C02Animal {}