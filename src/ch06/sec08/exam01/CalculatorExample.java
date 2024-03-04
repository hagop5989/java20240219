package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Caculator myCal = new Caculator();
        int x = 5;
        int y = 3;

        int result1 = myCal.plus(5, 6);
        myCal.powerOn();
        System.out.println("result1 = " + result1);
        System.out.println(myCal.divide(x, y));
        myCal.powerOff();
    }
}
