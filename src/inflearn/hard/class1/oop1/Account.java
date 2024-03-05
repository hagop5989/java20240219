package inflearn.hard.class1.oop1;

public class Account {
    int balance;
    void deposit (int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다.");
    }
    void withdraw (int amount){
        if (balance>=amount){
            System.out.println(amount + "원을 출금하였습니다.");
            balance -= amount;
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다. 현재잔액: " + balance);
        }
    }
    void showleft (){
        System.out.println("현재 잔액은: " + balance);
    }

}
