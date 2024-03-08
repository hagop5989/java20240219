package ch07.sec05.exam02;

public class SportCar extends Car {

    public void speedUP() {
        speed += 10;
    }

    /* 오버라이드 불가
    public void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */
}
