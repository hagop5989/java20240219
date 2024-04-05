package ch12.lecture.p5annotation;

public class C07Annotation {
    @MyAnnotation7
    private String field1;
    @MyAnnotation7(value = "hello", model = 9, role = {"admin"})
    private String field2;
    @MyAnnotation7("hi") // value 만 사용 시 생략 가능, @MyAnnotation7(value = "hi")과 동일함.
    private String field3;

}

@interface MyAnnotation7 {
    String value() default ""; // 기본값을 줄수있다.

    int model() default 0; // 기본값을 줄수있다.

    String[] role() default {}; // 기본값을 줄수있다.
}
