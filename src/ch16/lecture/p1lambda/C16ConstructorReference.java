package ch16.lecture.p1lambda;

public class C16ConstructorReference {
    C16MYInterface obj1 = chars -> new String(chars); // 왼쪽의 넘어온 파라미터를 오른쪽에 그대로 넣는다면
    C16MYInterface obj2 = String::new; // 이와 같이 줄일 수 있다.
}

// 4. 생성자 참조
// 특정 클래스 객체를 return 함
// 파라미터와 추상메소드의 파라미터가 같다
@FunctionalInterface
interface C16MYInterface {
    String method(char[] chars);
}


