package ch07.lecture.p7object;

public class C01Inheritance {
    public static void main(String[] args) {
        String s = "java";
        Object o = s; // String은 오브젝트

        boolean b1 = o.equals("hello");
        int h1 = o.hashCode();
        String s1 = o.toString();
        
    }
}
