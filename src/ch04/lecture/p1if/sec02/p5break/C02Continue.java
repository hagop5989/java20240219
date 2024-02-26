package ch04.lecture.p1if.sec02.p5break;

public class C02Continue {
    public static void main(String[] args) {
        // continue : 코드블럭 내 코드 실행을 중단하고
        // 반복문()괄호로 흐름이 넘어감

        boolean b = true;
        while (b) {
            System.out.println("statement 1 ");
            System.out.println("statement 2 ");
            System.out.println("statement 3 ");

            continue;
        }

    }
}
