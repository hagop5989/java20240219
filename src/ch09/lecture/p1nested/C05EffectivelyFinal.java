package ch09.lecture.p1nested;

public class C05EffectivelyFinal {
    void method(final int param) { // 파라미터도 final or effectively final
//        param = 3; // fianl이라 변경불가
        int i = 3; // final or effectively fianl
        class LocalClass {
            void method() {
                System.out.println(i);
                System.out.println(param);
            }
        }
    }
}
