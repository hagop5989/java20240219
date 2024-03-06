package ch06.lecture.p6final;

public class C01Final {
    public static void main(String[] args) {
        // final 키워드가 변수와 사용되면
        // 변수에 값을 딱 1번 할당할 기회를 갖는다

        // 변수
        // 지역변수 : 메소드 내에서 선언
        // 파라미터 :
        // 필드 : 인스턴스 필드
        //       스태틱 필드

        // 지역변수
        int i;
        i = 0;
        i = 3;

        final int j;
        j = 3;
//        j = 5; // x final이라 2번째는 할당불가
        System.out.println(j);
    }
}
