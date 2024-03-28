package ch06.exercise.test;

import java.util.Scanner;

public class Account {

    static int deposit;
    static int balance;
    static String number;
    static String name;
    static int firstMoney;
    static int count = 0;
    static int amount;

    static Account[] accounts = new Account[100];



    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getFirstMoney() {return firstMoney;}

    public void setFirstMoney(int firstMoney) {this.firstMoney = firstMoney;}

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
            accounts[count] = account;
            count++;

            System.out.println("--------");
            System.out.println("계좌생성");
            System.out.println("--------");

            System.out.print("계좌번호: ");
            number = scanner.nextLine();

            System.out.print("계좌주: ");
            name = scanner.nextLine();

            System.out.print("초기입금액: ");
            firstMoney = scanner.nextInt();
            balance = firstMoney;
            scanner.nextLine();

            System.out.println("결과: 계좌가 생성 되었습니다.");
    }

    public static void showList() {
        for (int i = 0; i < count; i++) {
            System.out.println("계좌번호: " + accounts[i].number + " 계좌주: " + accounts[i].name + " 잔액: " + accounts[i].balance);
        }
    }

    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호: ");
        String inputNumber = scanner.nextLine();
        System.out.print("예금액: ");
        int depositAmount = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                if (accounts[i].number.equals(inputNumber)) {
                    balance += depositAmount;
                    System.out.println(depositAmount + "원 입금완료");
                } else {
                    System.out.println("계좌번호가 잘못됐습니다.");
                }
            }
    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계좌번호: ");
        String inputNumber = scanner.nextLine();
        System.out.print("예금액: ");
        int withdrawAmount = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (accounts[i].number.equals(inputNumber)) {
                balance -= withdrawAmount;
                System.out.println(withdrawAmount + "원 출금완료");
            } else {
                System.out.println("계좌번호가 잘못됐습니다.");
            }
        }
    }

}
