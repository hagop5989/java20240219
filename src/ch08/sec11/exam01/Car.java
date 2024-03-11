package ch08.sec11.exam01;

public class Car {
    HankookTire tire1 = new HankookTire();
    KumhoTire tire2 = new KumhoTire();

    void run() {
        tire1.roll();
        tire2.roll();
    }

}
