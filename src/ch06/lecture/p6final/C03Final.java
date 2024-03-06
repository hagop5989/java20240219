package ch06.lecture.p6final;

public class C03Final {
    public static void main(String[] args) {
        C03Myclass o = new C03Myclass();
        System.out.println(o.i);
        System.out.println(o.j); // 10;
//        o.j=20; // x
    }
}

class C03Myclass {
    int i;
    final int j = 10;
    final int k;

    C03Myclass() {
        // 생성자에서 인스턴스 필드 초기화
        k = 200;
    }
}
