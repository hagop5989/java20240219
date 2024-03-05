package inflearn.ref;
import java.util.Scanner;

public class ProductOrderMain2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int purchase = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[purchase];

        for (int i=0; i<purchase; i++) {
        System.out.println((i + 1) + "번째 주문 정보를 입력하세요");
        System.out.print("상품명: ");
        String name = scanner.nextLine();

        System.out.print("가격: ");
        int price = scanner.nextInt();

        System.out.print("수량: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        orders[i] = createOrder(name,price,amount);
        }

        printOrderDetails(orders);
        System.out.println("최종 합계 : " + sumTotal(orders));
    }
    public static ProductOrder createOrder(String productName, int price, int quatity) {
        //createOrder 라는 메서드명을 통해 ProductOrder의 인스턴스를 새로 만들고, 메서드 사용시 할당된 인자에 근거하여 객체의 속성값을 모두 채워준다.
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quatity;
        return order;
    }
    public static void printOrderDetails (ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            int total = order.price *order.quantity;
            System.out.println("상품명: " + order.productName +", 가격: " + order.price + " 수량: " + order.quantity + " 결제금액: " + total );
        }
    }
    public static int sumTotal (ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
