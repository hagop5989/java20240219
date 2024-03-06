package ch06.p7access;

public class C01MyClass {
    // access modifier (접근 제한자, 접근 제어자)
    // 멤버 (필드, 메소드) 
    // 생성자, 클래스
    // public : 모든 곳에서 접근 가능( 가장 넓은 범위)
    // 하나의 파일에 하나의 public 파일만 작성 가능
    // protected
    //  : package private + 다른 패키지여도 상속 받으면 접근 가능
    // (package private, default)
    // : 같은 패키지 내에서 접근 가능
    // private : 클래스 내에서만 접근 가능 (가장 좁은 범위)

    // public field
    public int age;

    // package private field
    String name;

    // private field
    private String address;

    void method1() {
        System.out.println(age);
    }
}
