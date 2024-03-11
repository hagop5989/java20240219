package inflearn.hard.class1.poly.ex.pay0;

public class NaverPay1 extends PayInherit {
    @Override
    boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        return true;
    }
}
