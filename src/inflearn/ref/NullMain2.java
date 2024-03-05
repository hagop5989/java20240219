package inflearn.ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data); // 예외로 인해 뒤의 로직은 실행 안된다.
    }
}
