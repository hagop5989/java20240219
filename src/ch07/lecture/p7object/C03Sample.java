package ch07.lecture.p7object;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3); // 반지름 3
        Shape shape2 = new Rectangle(5, 7); // 가로 5, 세로 7
        shape1.printArea(); // 원의 면적 출력
        shape2.printArea(); // 사각형 면적 출력

        printDescription(shape1); // 반지름이 3인 원의 면적은 "28.2748"입니다
        printDescription(shape2); // 가로 5, 세로 7인 사각형 면적은 "35"입니다
    }

    public static void printDescription(Object o) {
        System.out.println(o.toString());
    }
}

// @formatter: off
abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {
    int r;

    public Round(int r) {
        this.r = r;
    }

    @Override
    public void printArea() {
        System.out.println(r * r * Math.PI);
    }

    @Override
    public String toString() {
        return "반지름이 " + r + "인 원의 면적은 \"" + (r * r * Math.PI) + "\"입니다.";
    }
}

/*---------------------------------------------------------------------------------------*/
class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println(getArea());
    }

    @Override
    public String toString() {
        return "가로 " + width + ", 세로 " + height + "인 직사각형의 넓이는 " + getArea() + " 입니다.";
    }

    public double getArea() {
        return width * height;
    }
}
