package inflearn.hard.class1.poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스는 객체 생성 불가(추상 클래스)

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
    }

    private static void soundAnimal(InterfaceAnimal animal) { //animal 상속받은 새로운 동물 추가 되더라도 상위개념을 호출하므로 문제없음
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) { //animal 상속받은 새로운 동물 추가 되더라도 상위개념을 호출하므로 문제없음
        System.out.println("동물이동 테스트 시작");
        animal.move();
        System.out.println("동물이동 테스트 종료");
    }
}
