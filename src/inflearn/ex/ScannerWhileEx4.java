package inflearn.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price, quantity, total = 0;
        int temp = 0;
        String name;
while(true) {
    System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
    int option = scanner.nextInt();
    scanner.nextLine();

        if(option == 1) {
        System.out.println("상품명을 입력해 주세요.");
            name = scanner.nextLine();
        System.out.println("상품의 가격을 입력하세요");
            price = scanner.nextInt();
        System.out.println("구매 수량을 입력하세요");
            quantity = scanner.nextInt();
            total += price * quantity;
        System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + total);
        temp=total;
        total=0;
        }
        if(option == 2) {
            total=temp;
            System.out.println( " 합계: " + total );
        }
        if(option == 3) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }
        else {
            System.out.println("올바른 옵션을 선택해주세요!!");
        }
        }
    }
}
