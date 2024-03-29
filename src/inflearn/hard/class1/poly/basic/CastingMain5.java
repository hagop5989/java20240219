package inflearn.hard.class1.poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;
            child.childmethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
