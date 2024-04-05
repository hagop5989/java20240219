package ch12.lecture.p5annotation;

public class C06Annotation {
    public static void main(String[] args) {
        @MyAnnotation6(value = "hello", data = {4, 5})
        String name;

        @MyAnnotation6(value = "hi", data = 6)
        int age;

        @MyAnnotation6(data = 7)
        String address;
    }
}

@interface MyAnnotation6 {
    String value() default "model"; // 기본값을 줄수있다.

    int[] data() default 5;

}