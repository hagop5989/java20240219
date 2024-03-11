package inflearn.hard.class1.poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        result = isResult(option, amount);
        extracted(result);
    }

    private static void extracted(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    private static boolean isResult(String option, int amount) {
        boolean result;
        if (option.equals("kakao")) {
            KaKaoPay1 kakaoPay = new KaKaoPay1();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay1 naverPay = new NaverPay1();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        return result;
    }
}