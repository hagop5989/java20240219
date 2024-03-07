package ch07.lecture.p2polymorphism;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Fish fish = new C03Fish();
        C03Animal animal = fish;
        animal.breathe();
        animal.swim();
        fish.jump();
//        animal.jump();

    }
}

class C03Animal {
    public void breathe() {
        System.out.println("호흡하다.");
    }

    public void swim() {
        System.out.println("동물 수영하다.");
    }
}

class C03Cat extends C03Animal {
    @Override
    public void swim() {
        System.out.println("고양이 수영하다.");
    }
}

class C03Fish extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("아가미로 호흡하다");
    }

    public void jump() {
        System.out.println("물고기가 펄떡이다.");
    }

}