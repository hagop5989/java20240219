package inflearn.hard.class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // 상품 주문 정보를 'ProductOrder' 타입의 변수를 받아 저장
        // 상품 주문 정보와 최종 금액 출력
        ProductOrder order1 = new ProductOrder();
        order1.productName = "핸드폰";
        order1.price = 50000;
        order1.quantity = 3;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "책";
        order2.price = 20000;
        order2.quantity = 5;

        ProductOrder[] order_wrap = {order1, order2};
        int total = 0;

        for (ProductOrder productOrder : order_wrap) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            total += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제금액: " + total);
    }
}
