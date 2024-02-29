package ch05.lecture.p1array;

import java.util.Scanner;

public class C21Scanner {
    public static void main(String[] args) {
        String s1 = "my name is son.";
        Scanner scanner = new Scanner(s1); // 이렇게 특정 스트링 변수를 넣어버릴수도 있음

        String token1 = scanner.next(); // my
        String token2 = scanner.next(); // name
        String token3 = scanner.next(); // is
        String token4 = scanner.next(); // son.

        System.out.println("token1 = " + token1);
        System.out.println("token2 = " + token2);
        System.out.println("token3 = " + token3);
        System.out.println("token4 = " + token4);

        String token = scanner.next(); // 더 읽을 토큰이 없어서 오류 발생

    }
}
