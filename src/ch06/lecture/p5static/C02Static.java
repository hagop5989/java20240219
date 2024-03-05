package ch06.lecture.p5static;

import java.util.Arrays;
import java.util.Scanner;

public class C02Static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // in이 static 필드, 클래스 변수임
        int[] a = {3, 4};
        System.out.println(Arrays.toString(a));

    }
}
