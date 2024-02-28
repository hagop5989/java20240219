package inflearn.ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // new로 만드는 방식은 인스턴트를 만드며  다 초기화가 됨
        System.out.println("value = " + data.value1);
        System.out.println("value = " + data.value2);
    }
}
