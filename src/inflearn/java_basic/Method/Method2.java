package inflearn.java_basic.Method;

public class Method2 {
    // 매개변수와 반환타입이 없는 case
    // 매개변수가 없을시 비우고 정의
    // 반환타입이 없을 시 선언시 반환타입을 void로 선언 (public static void ...)
    // 모든 메서드는 return을 출력하지만 반환타입 void인 경우 생략해도 된다.
    // return을 만나면 해당 메서드는 종료된다.
    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        return;
    }

}
