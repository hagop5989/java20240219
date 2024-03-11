package ch07.lecture.p8protected.package2;

import ch07.lecture.p8protected.package1.C01Parent;

public class C01Child extends C01Parent {
    private void method1() {
        // package private
//        super.method1();

        // protected은 접근가능
        super.method2();
    }
}
