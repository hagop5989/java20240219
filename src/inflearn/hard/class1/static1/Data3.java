package inflearn.hard.class1.static1;

public class Data3 {
    public String name;
    public static int count; // static
    // 멤버변수에 static을 붙이면 static변수 / 정적변수 / 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
