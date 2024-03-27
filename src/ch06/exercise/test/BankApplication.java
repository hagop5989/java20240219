package ch06.exercise.test;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        int menu;
        boolean run = true;


        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("선택>");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch(menu) {
                case 1 -> Account.createAccount();
                case 2 -> Account.showList();
                case 3 -> Account.deposit();
                case 4 -> Account.withdraw();
                case 5 -> {
                    System.out.println("시스템을 종료합니다.");
                    return;
                }
            }
        }
    }
}
