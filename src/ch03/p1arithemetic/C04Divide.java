package ch03.p1arithemetic;

public class C04Divide {
    public static void main(String[] args) {
        // 정수 나누기 연산 시 0으로 나누면 안됨
        int a = 3;
        int b = 0;

//        int c = a / b;
//        System.out.println("c = " + c);

        if (b != 0) {
            int c = a / b;
            System.out.println("c = " + c);

        }
        if (b != 0) {
            int d = a % b;
        }
    }
}
