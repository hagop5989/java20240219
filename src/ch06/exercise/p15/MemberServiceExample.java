package ch06.exercise.p15;

import java.util.Scanner;

public class MemberServiceExample {
    String id;
    String passwords;

    public void main(String[] args) {
        scanner();
        createId();
//        memberService.login(id,passwords);

    }

    public void createId() {
        scanner();
        MemberService memberService = new MemberService(id, passwords);
    }

    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("passwords를 입력하세요: ");
        String passwords = scanner.nextLine();
    }
}
