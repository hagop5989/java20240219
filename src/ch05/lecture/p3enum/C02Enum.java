package ch05.lecture.p3enum;

public class C02Enum {
    public static void main(String[] args) {
        // enum type 사용 이유 : 안전하고 읽기 쉬운 코드 작성을 위함
        Season s = Season.FALL; //가을이네요

        switch (s) { // Enum 은 switch 와 사용하기 좋다
            case SPRING -> System.out.println("봄이네요");
            case FALL -> System.out.println("가을이네요");
            case SUMMER -> System.out.println("여름이네요");
            case WINTER -> System.out.println("겨울이네요");
        }
        // java.lang.Enum 에서 상속한 메소드
        System.out.println(s.name());
        System.out.println(s.ordinal());

        // java.lang.Object 에서 상속한 메소드
        System.out.println(s.toString());
        System.out.println(s.hashCode());

        s.printDescription(); // FALL 이네요.
    }
}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    //필요하면 메소드 작성가능
    public void printDescription() {
        System.out.println(this.name() + "이네요.");
    }
}
