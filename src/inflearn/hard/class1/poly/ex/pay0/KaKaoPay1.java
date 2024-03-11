package inflearn.hard.class1.poly.ex.pay0;

public class KaKaoPay1 extends PayInherit {
    @Override
    boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        return true;
    }
}
