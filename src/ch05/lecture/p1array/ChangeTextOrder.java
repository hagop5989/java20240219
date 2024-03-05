package ch05.lecture.p1array;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeTextOrder {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = null;
        int arr1Length = 0;

        System.out.println("arr1의 배열 크기를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        arr1Length = scanner.nextInt();
        arr1 = new int[arr1Length];
        arr2 = new int[arr1Length];
        
        for (int i=0; i<arr1Length; i++) {
            System.out.print("arr1["+ i +"]" + "값을 입력해 주세요: ");
            arr1[i] = scanner.nextInt();
        }

        for (int i=0, j=arr1Length-1; i<arr1Length && j>=0; i++,j--) {
            arr2[i] = arr1[j];
        }

        for (int i : arr2) {
        System.out.print(i);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));





    }
}
