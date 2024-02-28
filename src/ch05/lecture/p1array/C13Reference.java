package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {
        // 04. 참조타입 (배열복사 예제) .png

        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.identityHashCode(arr1)); // ->189568618
        System.out.println(System.identityHashCode(arr2)); // ->189568618

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 2); // 복사하여 새 배열을 만들음, 참조값이 달라짐

        System.out.println(System.identityHashCode(arr3)); // ->793589513
        System.out.println(System.identityHashCode(arr4)); // ->1313922862

        System.arraycopy(arr1, 0, arr2, 0, 5);

    }
}
