package ch16.lecture.p1lambda;

public class C09Lambda {
    public static void main(String[] args) {
        C09MyInterface obj1 = () -> 0;
        C09MyInterface obj2 = () -> 1;
        C09MyInterface obj3 = () -> 2;
    }
}


// 4. 리턴 있는 추상 메소드
@FunctionalInterface
interface C09MyInterface {
    int method();
}
