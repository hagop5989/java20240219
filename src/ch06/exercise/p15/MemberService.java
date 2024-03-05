package ch06.exercise.p15;

import java.util.Scanner;

public class MemberService {
    private String id;
    private String passwords;

    public MemberService(String id, String passwords) {
        this.id = id;
        this.passwords = passwords;
    }

    public void login(String id, String password) {
        if (this.id.equals(id) && this.passwords.equals(password)) {
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("id 또는 password 올바르지 않습니다.");
        }
    }

    public void logout(String id) {
        System.out.println(id + " 님이 로그 아웃 되었습니다.");
    }


    public void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("passwords를 입력하세요: ");
        String passwords = scanner.nextLine();
    }
}


