package ch12.lecture.p2wrapper;

public class C03WrapperClass {
    public static void main(String[] args) {
        //주의 해야 할 내용
        int a = 5;
        Integer b = 5; // 이것도 자동박싱 된것
        Number c = 5; // 이것도 자동박싱 된것
        Object d = 5; // 이것도 자동박싱 된것

        Integer e = null; // ok
//        int f = null; // x
    }
}
