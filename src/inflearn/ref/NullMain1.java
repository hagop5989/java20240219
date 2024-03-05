package inflearn.ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조하는 대상이 없다.
        System.out.println("1. data = " + data);
        data = new Data(); // 참조값이 생김
        System.out.println("2. data = " + data);
        data = null; // 참조값이 없어짐
        System.out.println("3. data = " + data);
    }
}
