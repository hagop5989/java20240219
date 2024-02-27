package inflearn.java_basic.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        //입금,출금,잔액확인,종료 기능
        //출금시 잔액없으면 00원 출금하려했으나 잔액이 부족합니다 뜨게하기
        int amount = 0;
        int balance = 10000;
        System.out.println("현재잔액: " + balance + "원");

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2.출금 | 3.잔액확인 | 4. 종료 ");
            System.out.println("---------------------------------------");

            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);
//            System.out.print("현재잔액: " + balance + "원");
            } else if (menu == 2) {
                System.out.print("출금액을 입금하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (menu == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }


    public static int deposit(int balance, int input) {
        balance += input;
        System.out.println(input + "원을 입금하였습니다. 현재잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdraw) {
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재잔액: " + balance + "원");
        } else {
            System.out.println("잔액보다 출금액이 많아 출금할 수 없습니다.");
        }
        return balance;
    }
}
