package ch06.lecture.p2method;

public class C08VarArgs {
    public static void main(String[] args) {
        C08MyCalss o1 = new C08MyCalss();
        o1.method1();
        o1.method1(1);
        o1.method1(3, 5);
//        o1.method1(6,7,8); // x
        //method1은 다 다른 메소드로 호출된 것

        o1.method2();
        o1.method2(1);
        o1.method2(2, 3);
        o1.method2(3, 4, 5, 6, 6, 1, 2, 3, 5, 2, 3, 1);
        //method2은 다 같은 메소드로 호출된 것
    }
}

class C08MyCalss {
    // 같은 타입의
    void method1() {
        System.out.println("파라미터 0개");
    }

    void method1(int a) {
        System.out.println("파라미터 1개");
    }

    void method1(int a, int b) {
        System.out.println("파라미터 2개");
    }

    // varargs (가변인자, 가변길이 매개변수)
    // 메소드 내에서 배열로 사용
    void method2(int... a) {
        System.out.println("파라미터 0개 이상");
        System.out.println(a.length);
    }

    //다른 파라미터와 함께 사용 시 꼭 마지막에 넣어야 함.
    void method3(String a, int... b) {
    }
}

