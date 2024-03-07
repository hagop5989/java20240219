package inflearn.hard.class1.extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0); // 기본 생성자 생략 가능 (매개변수없는 기본생성자)
        System.out.println("Class B 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능 (매개변수없는 기본생성자)
        System.out.println("Class B 생성자 a=" + a + "b= " + b);
    }
}
