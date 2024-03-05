package ch06.lecture.p3constructor;

public class C02Constructor {
    public static void main(String[] args) {
        C02Myclass obj1 = new C02Myclass();
        C02Myclass obj2 = new C02Myclass();

        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}

class C02Myclass {
    int age;

    C02Myclass() {
        age = 33;
    }
}
