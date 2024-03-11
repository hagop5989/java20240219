package ch08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {
        C03Cat pet1 = new C03Cat();
        C03GoldFish pet2 = new C03GoldFish();
        
        pet1.feed(); // 인스턴스 메소드 실행
        pet2.feed(); // 인스턴스 메소드 실행

    }
}

// @formatter:off
interface C03Pet {
    // 인터페이스의 메소드는 모두 추상 메소드, body가 없다.
    // public abstract 생략 가능
    public abstract void feed();
}
abstract class C03Animal {
    public abstract void breathe();
}
class C03Cat extends C03Animal implements C03Pet{
    @Override
    public void breathe() {
        System.out.println("C03Cat.breathe");
    }
@Override public void feed() {
        System.out.println("고양이에게 닭가슴살을 줍니다.");
    }}
class C03Tiger extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("C03Tiger.breathe");
    }
}
class C03GoldFish extends C03Animal implements C03Pet{
    @Override
    public void breathe() {
        System.out.println("C03GoldFish.breathe");
    }
@Override public void feed() {
        System.out.println("물고기에게 밥을 줍니다.");
    }}

