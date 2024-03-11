package ch08.lecture.p1interface;

public class C04Field {
    public static void main(String[] args) {
        int a = C04MyInterface.AGE;
        System.out.println(C04MyInterface.NAME);
        System.out.println(C04MyInterface.MY_ADDRESS + "입니다.");
    }
}

interface C04MyInterface {
    // field
    // public static final
    int AGE = 1; // 값을 1번 꼭 할당해야 함.
    String NAME = "son hm";
    String MY_ADDRESS = "london";
}
