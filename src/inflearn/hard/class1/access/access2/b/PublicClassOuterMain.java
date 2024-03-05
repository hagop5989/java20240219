package inflearn.hard.class1.access.access2.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;

import inflearn.hard.class1.access.access2.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 class1 = new Defaultclass1();
//        DefaultClass2 class2 = new Defaultclass2();
    }
}
