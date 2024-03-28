package codingtest.thisistest;

import java.util.Scanner;

public class Ch03P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt =0;

        while (n != 1){
        if (n % k != 0){
            n = n-1;
        } else {
            n = n/k;
        }
        cnt++;
        }
        System.out.println("cnt = " + cnt);

    }
}
