package ch12.lecture.p1object;

public class C06HashCode {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = new String("spring");

        // 객체는 다르지만 s1,s2의 해시 코드가 같게 나옴
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());
        System.out.println("s3 = " + s3.hashCode());

        // 실제 오브젝트의 해시코드를 보고 싶다면 (재정의 된것도 원래 것이 나옴)
        System.out.println("s1 = " + System.identityHashCode(s1));
        System.out.println("s2 = " + System.identityHashCode(s2));
        System.out.println("s3 = " + System.identityHashCode(s3));
    }
}
