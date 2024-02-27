package ch04.lecture.p1if.sec02.ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int balance = 10000;
        int menu;
        int input;
        System.out.println("현재잔액은 " + balance + " 원 입니다.");

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();


            //입금
            if (menu == 1) {
                System.out.println("선택> " + menu);
                System.out.print("입금할 금액을 입력하세요 :");
                input = scanner.nextInt();
                balance = deposit(balance, input);
                System.out.println("현재잔액은 " + balance + " 원 입니다.");
                //출금
            } else if (menu == 2) {
                System.out.println("선택> " + menu);
                System.out.print("출금할 금액을 입력하세요 :");
                input = scanner.nextInt();
                balance = withdraw(balance, input);
                System.out.println("현재잔액은 " + balance + " 원 입니다.");
                //잔액
            } else if (menu == 3) {
                System.out.println("선택> " + menu);
                System.out.println("현재잔액은 " + balance + " 원 입니다.");
                //종료
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
                //잘못된 메뉴선택
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("출금할 잔액이 부족합니다.");
        }
        return balance;
    }

}
