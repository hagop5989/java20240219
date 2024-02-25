package inflearn.ex;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("상품의 수량 입력하세요 (-1을 입력하면 종료)");
        int quantity = scanner.nextInt();
        if (quantity == -1) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }
        else {
        System.out.println("상품의 가격을 입력하세요 (-1을 입력하면 종료)");
        int price = scanner.nextInt();
        if (price == -1) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }
        int total = price * quantity;
        System.out.println("총비용: " + total);
        }

            }
        }
    }


