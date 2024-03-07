package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체 제공 driver()메소드 호출

        driver.drive(new Bus());

        driver.drive(new Taxi());
    }
}
