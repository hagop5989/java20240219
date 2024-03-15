package ch13.lecture.p1generic;

public class C04Polymorphism {
    public static void main(String[] args) {
        C04Box c04Box = new C04Box();

    }
}

class C04Box<T> {
    private T item;

    // item의 타입 상관없이 인스턴스 를 실행할 수 있는가? yes -> Object, 등 상위 것
    // 별개로 특정 타입의 메소드를 사용하고 싶다면? -> 타입 제한

    public void someMethod() {
        // Object의 메소드 사용 가능

        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
