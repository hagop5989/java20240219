package ch06.exercise.Ex20;

import ch06.sec13.exam01.package1.A;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        int menu;
        int count = 0;
        boolean run = true;

        Account[] accounts = new Account[100];

        while (run) {

            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("선택>");
            menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    Account account = new Account();
                    System.out.println("--------");
                    System.out.println("계좌생성");
                    System.out.println("--------");

                    System.out.print("계좌번호: ");
                    account.setAccountNumber(scanner.nextLine());
                    scanner.nextLine();
                    System.out.print("계좌주: ");
                    account.setAccountHolder(scanner.nextLine());
                    System.out.print("초기입금액: ");
                    account.setInitialDeposit(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("결과: 계좌가 생성 되었습니다.");
                    accounts[count] = account;
                    count++;
                }

                case 2 -> {
                    for (int i = 0; i < count; i++) {
                        System.out.println("계좌번호: " + accounts[i].getAccountNumber() + "계좌주: " + accounts[i].getAccountHolder() + " 초기입금액: " + accounts[i].getInitialDeposit());
                    }
                }
            }
        }

    }
}
