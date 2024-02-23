package ch03.p2assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // +=, -=, *=, /=, %=
        int a = 10;
//          a = a + 5;
        a += 5;
        System.out.println("a = " + a);

        int b = 10;
        b += 5;
        System.out.println("b = " + b);

        a = a - 3;
        System.out.println("a = " + a);

        b -= 3;
        System.out.println("b = " + b);

        a /= 4; // a = a/4
        System.out.println("a = " + a);
    }
}
