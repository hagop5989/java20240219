package ch13.lecture.p1generic;

import ch08.sec10.exam01.C;

public class C06WildCard {
    public static void main(String[] args) {
        Integer v1 = 100;
        Number v2 = v1;
        Double v3 = 3.14;
        Number v4 = v3;
        Object v5 = v2;
        Object v6 = v4;

        C06Box<Integer> b1 = new C06Box<>();
        //C06Box<Number> b2 = b1; // x 상속관계가 없어서 안됨, 그런데 상속관계로 만들때 쓰는게 와일드 카드
        C06Box<? extends Number> b2 = b1; // Number를 상속한것이 되어 이제는 됨.
        C06Box<Double> b3 = new C06Box<>();
        C06Box<? extends Number> b4 = b3; // Double도 Number의 하위타입
        C06Box<Object> b5 = new C06Box<>();
        //C06Box<? extends Number> b6 = b5; // Object는 Number의 상위타입이라 안됨, 부모가 자식에 못들어감
        C06Box<? super Number> b7 = b5; // 이건됨, super를 쓰는순간 Number와 Number의 상위타입까지 접근가능

    }
}

class C06Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
