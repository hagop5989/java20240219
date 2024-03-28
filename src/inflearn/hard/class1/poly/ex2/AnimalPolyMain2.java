package inflearn.hard.class1.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        Animal[] animalArr = {dog, cat ,cow, duck};
        Animal index1 = dog;
        Animal index2 = cat;
        Animal index3 = cow;

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }


    }

}
