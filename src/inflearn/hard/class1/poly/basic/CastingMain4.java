package inflearn.hard.class1.poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); //문제 없음

        Parent parent2 = new Parent(); // 부모 것만 생성 됨
//        Child child2 = (Child) parent2; // 런타임 오류 - classCastException
//        child2.childMethod(); // 실행불가
    }
}
