package codingtest.thisistest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ch04P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 횟수 입력: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("이동방향입력");
        String move =sc.nextLine();
        String [] str= move.toUpperCase().split("");
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));

        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(1);

        for (int i = 0; i < str.length; i++) {
            switch (str[i]){
                case "R"->{
                    if (list.get(1)!=5){
                    list.set(1,list.get(1)+1);
                }}
                case "L"->{
                    if (list.get(1)!=1){
                        list.set(1,list.get(1)-1);
                    }
                }
                case "U"->{
                    if (list.get(0)!=1){
                        list.set(0,list.get(0)-1);
                    }
                }
                case "D"->{
                    if (list.get(0)!=5){
                        list.set(0,list.get(0)+1);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
