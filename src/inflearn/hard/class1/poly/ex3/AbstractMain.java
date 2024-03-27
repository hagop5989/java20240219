package inflearn.hard.class1.poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스 생성 불가
//        new AbstractAnimal()

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) { //animal 상속받은 새로운 동물 추가 되더라도 상위개념을 호출하므로 문제없음
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
