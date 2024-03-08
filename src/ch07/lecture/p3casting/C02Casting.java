package ch07.lecture.p3casting;

public class C02Casting {
    public static void main(String[] args) {
        C02Animal animal1 = new C02Tiger(); //Tiger객체를 animal1에 할당 (Animal 형식으로)
        System.out.println("animal1");
        C02Tiger tiger1 = (C02Tiger) animal1;
        //Animal형식의 Tiger객체를 Tiger형식으로 강제형변환
        //tiger1은 Tiger 형식이 되었으나, animal1은 여전히 Tiger 객체를 사용한(참조값을 가진) Animal 형식임

        System.out.println("animal->tiger");

        C02Cat cat1 = (C02Cat) animal1;
        // anmal1(Tiger객체 기반)를 cat1에 할당시키려하니 전혀 상관없는 관계이므로 오류 발생
        System.out.println("animal->cat");
        // 컴파일(compile) 오류 아님, 실행(runtime) 오류

        System.out.println("프로그램 종료");
    }
}

class C02Animal {
}

class C02Tiger extends C02Animal {
}

class C02Cat extends C02Animal {
}
