package inflearn.hard.class1.poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        //변하는 부분
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Pig()};
        //alt + ctrl + n  -> inline variable, 변수선언 된 것을 제거하고 합쳐버림.

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) { //animal 상속받은 새로운 동물 추가 되더라도 상위개념을 호출하므로 문제없음
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

}
