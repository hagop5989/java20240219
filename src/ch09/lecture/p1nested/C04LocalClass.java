package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 3;
        int k = 2; //effectively final , final로 취급된다.
        class LocalClass {
            void method1() {
                int i = 0;
                //
                System.out.println(i);
                i = 1;

                //감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println(j); // 감싸고 있는 메소드의 변수 사용가능
//                j = 5; // 감싸고 있는 메소드의 변수 값 변경은 불가능
                System.out.println(k);
            }
        }
    }
}
