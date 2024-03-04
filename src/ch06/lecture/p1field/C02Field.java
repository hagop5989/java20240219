package ch06.lecture.p1field;

public class C02Field {
    public static void main(String[] args) {
        Car02 car1 = new Car02();
        car1.color = "검은색";
        car1.weight = 999.99;

        Car02 car2 = new Car02();
        car2.color = "하얀색";
        car2.weight = 888.99;

        System.out.println(car1.color);
        System.out.println(car1.weight);

        System.out.println(car2.color);
        System.out.println(car2.weight);
    }
}
