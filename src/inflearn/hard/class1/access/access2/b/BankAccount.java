package inflearn.hard.class1.access.access2.b;

public class BankAccount {
    // 캡슐화가 잘된 코드의 예제
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void depost(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : getBalance;
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야함
        return amount > 0;
    }
}
