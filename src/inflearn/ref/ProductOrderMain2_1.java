package inflearn.ref;

public class ProductOrderMain2_1 {
    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder();

        String[] arr_name = {"핸드폰","책"};
        int[] arr_price= {50000,20000};
        int[] arr_quantity = {3,5};
        int total = 0;

        for (int i=0; i< arr_name.length; i++) {
            String n =productOrder.productName = arr_name[i];
            int a = productOrder.price = arr_price[i];
            int b = productOrder.quantity = arr_quantity[i];
            total += productOrder.price * productOrder.quantity;
            System.out.println("상품명: " + n + ", 가격: " + a + ", 수량: " + b + " 결제금액: " + total);
        }
        System.out.println("최종 결제금액: " + total);
    }
}
