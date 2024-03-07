package ch07.lecture.p2polymorphism;

public class C01Override {
    public static void main(String[] args) {
        C01GoldFish goldFish = new C01GoldFish();
        goldFish.breathe();
        C01Cat cat = new C01Cat();
        cat.breathe();
    }
}

class C01Cat extends C01Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 호흡합니다.");
    }
}

class C01Animal {
    public void breathe() {
        System.out.println("호흡합니다.");
    }
}

class C01GoldFish extends C01Animal {
    // 눈에는 안보이지만 호흡하다 라는 기능이 있음
    // method override : 상위 타입의 메소드를 재정의

    @Override
    public void breathe() {
        System.out.println("아가미로 호흡합니다.");
    }
}

class C01Cate extends C01Animal {
    // 눈에는 안보이지만 호흡하다 라는 기능이 있음

}


