package ch04.lecture.p1if.sec02;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        Random random = new Random();
        //가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3)를 선택하세요.");

        int user = Integer.parseInt(scanner.nextLine());
        int coumputer = random.nextInt(1, 4);


        System.out.println("user = " + user);
        System.out.println("coumputer = " + coumputer);


    }
}
