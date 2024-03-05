package inflearn.ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        int total = 0;
        String[] arr_name = {"핸드폰","책"};
        int[] arr_price= {50000,20000};
        int[] arr_quantity = {3,5};

        for (int i=0; i< arr_name.length; i++) {
        System.out.println(order(arr_name[i],arr_price[i],arr_quantity[i]));
        total += arr_price[i] * arr_quantity[i];
        }
        System.out.println("최종 결제금액: " + total);
    }
    public static String order (String productName, int price, int quantity ) {
        int total = price * quantity;
        String output = ("상품명: " + productName + ", 가격: " + price + ", 수량: " + quantity + " 결제금액: " + total);
        return output;
    }
}
