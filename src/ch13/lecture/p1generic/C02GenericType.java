package ch13.lecture.p1generic;

public class C02GenericType {
    public static void main(String[] args) {
        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();

        box1.setItem("java");
        String item = box1.getItem();

        box2.setItem(300);
        Integer item1 = box2.getItem();
    }
}

// generic type
// <> :타입 파라미터
// 타입 파라미터 이름 작성관습
// : 대문자 한글자
// 주로 쓰는 이름들
// T : Type
// E : Element (집합의 원소, 배열의 원소..)
// K : Key
// V : Value
// R : Return, Result

// S,U,V : 별다른 의미없는 경우
// T1, T2 : T에 숫자를 붙임
class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
