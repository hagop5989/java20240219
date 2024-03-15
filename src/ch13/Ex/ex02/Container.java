package ch13.Ex.ex02;

public class Container<T> {
    T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
