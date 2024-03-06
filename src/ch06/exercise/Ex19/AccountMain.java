package ch06.exercise.Ex19;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(100000000);
        System.out.println("현재잔고: " + account.getBalance());
    }
}
