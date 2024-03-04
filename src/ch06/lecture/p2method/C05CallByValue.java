package ch06.lecture.p2method;

import java.util.Arrays;

public class C05CallByValue {
    public static void main(String[] args) {
        C05Myclass obj1 = new C05Myclass();
        int[] a1 = new int[3];
        a1[0] = 99;
        obj1.method2(a1);
        System.out.println(Arrays.toString(a1));// [-3, -5,-7]? [99,100,0]
    }
}

class C05Myclass {
    void method1(int[] arr) {
        System.out.println(arr.length);
        arr[1] = 100;
    }

    void method2(int[] arr) {
        arr = new int[]{-3, -5, -7};
        System.out.println(Arrays.toString(arr)); // [-3, -5, -7]
    }
}

