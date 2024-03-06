package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.I = 30; // static은 클래스 변수여서 인스턴스 생성없이 사용 가능
        C04MyClass.I = 50;

    }
}
// final static field
// final static field 작명 관습 : UPPER_SNAKE_CASE, 다 대문자, 여러단어 조합시 _(언더스코어)로 연결함.

class C04MyClass {
    static int I;
    final static int K = 100;
    final static int J;
    static final int AMOUNT_OF_MONEY = 300;

    static {
        J = 200;
    }

}
