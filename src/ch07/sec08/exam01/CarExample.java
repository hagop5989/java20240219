package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //하위 타입의 것이 상위 타입에 들어감
        //한국타이어
        myCar.tire = new HankookTire();
        myCar.run();

        //금호타이어
        myCar.tire = new KumhoTire();
        myCar.run();


    }
}
