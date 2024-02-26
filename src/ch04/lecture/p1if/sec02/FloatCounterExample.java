package ch04.lecture.p1if.sec02;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            //for문의 인덱스 변수는 정수형으로 써야 한다.
            System.out.println(STR."x = \{x}");
        }
    }
}
