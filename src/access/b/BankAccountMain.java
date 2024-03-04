package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        // 쓰는 개발자는 3가지만 알면 된다 (deposit, withdraw,getBalance)
        BankAccount account = new BankAccount();
        account.depost(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
