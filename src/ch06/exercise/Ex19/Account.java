package ch06.exercise.Ex19;

public class Account {
    private static int balance = 0;
    private static int MIN_BALANCE = 0;
    private static int MAX_BALANCE = 1_000_000;

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int amount) {
        if (MIN_BALANCE <= balance && balance < MAX_BALANCE) {
            if (amount < 0 || amount >= 1_000_000) {
                balance += amount;
                System.out.println(amount + "원 저장 완료");
                System.out.println("현재잔고: " + balance);
            } else {
                System.out.println("저장할 수 없습니다.");
                System.out.println("현재잔고: " + balance);
            }
        }
    }
}
