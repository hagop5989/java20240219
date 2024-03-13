package ch16.lecture.p1lambda;

public class C07Sample {
    public static void main(String[] args) {
        C07MyInterFace obj1 = str1 -> System.out.println(str1 + str1 + str1);
        C07MyInterFace obj2 = str2 -> System.out.println(str2 + str2);
        C07MyInterFace obj3 = str3 -> System.out.println(str3.toUpperCase());

        obj1.method("hi"); // hihi
        obj2.method("hello"); // hellohello
        obj3.method("spring"); // SPRING

    }
}

@FunctionalInterface
interface C07MyInterFace {
    void method(String a);
}
