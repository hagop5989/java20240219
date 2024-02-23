package ch03.p1arithemetic.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
//        double z = x % y;
//        System.out.println(z + 2);

        //알맞은 코드
        if (Double.isFinite(z) || Double.isNaN(z)) {
            System.out.println("산출불가");
        } else {
            System.out.println(z + 2);


        }
    }
}
