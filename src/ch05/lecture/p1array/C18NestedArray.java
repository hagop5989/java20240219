package ch05.lecture.p1array;

import java.util.Arrays;

public class C18NestedArray {
    public static void main(String[] args) {
        // 1차원 배열
        // 원소가 5개인 배열
        // 원소의 타입이 int
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        // 2차원 배열
        // 원소가 3개인 배열
        // 원소의 타입이 int[]
        int[][] arr2 = new int[3][];
        System.out.println(Arrays.toString(arr2));

        arr2[0] = new int[5]; // [0,0,0]
        arr2[1] = new int[4]; // [0,0,0,0]
        arr2[2] = new int[2]; // [0,0]
        // 넣어줄때 같은 크기로 넣으면 행렬이 되는것이고, 다른크기로 넣으면

        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);

        // 초기값을 지정해서 배열 만들기
        int[] arr3 = new int[]{8, 2, 1};
        int[] arr4 = {7, 3, 2, 0};

        // 2차원 배열
        int[][] arr5 = new int[][]{
                {8, 2, 0, 1},
                {23, 41, 32, 515},
                {-1, 3, -5, 33 - 123}
        };
        int[][] arr6 = {
                {8, 2, 0, 1},
                {23, 41, 32, 515},
                {-1, 3, -5, 33 - 123}
        };

        int[][] arr7 = new int[3][];
        arr7[0] = new int[]{5, 4, 1};
        arr7[1] = new int[]{5, 4, 1};

    }
}
