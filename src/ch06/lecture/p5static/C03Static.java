package ch06.lecture.p5static;

import java.util.Arrays;

// static import  - static 멤버들을 앞의 class명을 생략하고 쓰게 함.
import static java.util.Arrays.*;
//import static java.util.Arrays.copyOf;

public class C03Static {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        int[] brr = new int[5];
        fill(brr, 100);

        int[] crr = copyOf(arr, arr.length);
    }
}
