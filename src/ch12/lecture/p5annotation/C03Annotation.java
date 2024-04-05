package ch12.lecture.p5annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation3
public class C03Annotation {
    @MyAnnotation3
    private String name;

    @MyAnnotation2
    public C03Annotation(
            @MyAnnotation3
            String name) {
    }

    public void method(
            @MyAnnotation3
            String name) {
        @MyAnnotation3
        int variable;
    }
}

@Target({ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.FIELD,
        ElementType.LOCAL_VARIABLE})  // ElementType. XX -> XX 타입에서만 어노테이션 가능케 함.
@interface MyAnnotation3 {

}
