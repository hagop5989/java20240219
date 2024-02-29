package ch05.lecture.p1array;

import java.util.Scanner;

public class C23Scanner {
    public static void main(String[] args) {
        String s = "my age is 33 or 44"; // 6개 토큰
        Scanner scanner = new Scanner(s);
        System.out.println(scanner.next()); // my
        System.out.println(scanner.next()); // age
        System.out.println(scanner.next()); // is
        System.out.println(scanner.next()); // 33
        System.out.println(scanner.next()); // or
        System.out.println(scanner.nextInt()); // 44

//        System.out.println(scanner.next()); // 이거는 안됨.

    }
}
