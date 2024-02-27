package inflearn.java_basic.array.ex.ex;

import java.util.Scanner;

public class ArrayEx8 {
    //상품등록, 상품목록, 종료 의 기능을 가진 프로그램 만들기
    //상품등록: 상품의 이름과 가격을 입력받아 저장
    //상품목록: 지금까지 등록한 모든 상품의 목록을 출력
    //종료: 프로그램을 종료
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productName = new String[10];
        int[] productPrice = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("1.상품등록 | 2.상품목록 | 3.종료");
            String select = scanner.nextLine();
            if (select.equals("상품등록")) {
                System.out.print("상품 이름을 입력하세요: ");
                productName[i] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrice[i] = scanner.nextInt();
                System.out.println();
            } else if (select.equals("상품목록")) {
                for (int j = 0; j < productName.length; j++) {
                    System.out.println(productName[j] + ": " + productPrice[j] + "원");
                }
            }
        }
    }
}
