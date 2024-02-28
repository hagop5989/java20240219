package ch05.lecture.p1array;

import java.util.Arrays;

public class C12Arrays {
    public static void main(String[] args) {
        // java.util.Arrays : 유틸리티 클래스

        // toString : 배열을 보기 좋게 String으로 반환
        int[] arr1 = {9, 1, 3, 0, 4};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        // sort : 배열을 오름차순으로 정렬
        Arrays.sort(arr1); // 배열 오름차순으로 정렬되었음.
        System.out.println(Arrays.toString(arr1)); // 정렬된 배열 출력

        // fill : 특정값으로 배열 채우기

        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2)); // 모두 초기값 0이 출력됨

        Arrays.fill(arr2, 23); // arr2 배열에 23으로 모두 채움
        System.out.println(Arrays.toString(arr2)); // 모두 23으로 채워진 arr2 출력됨

        // copyOf : 배열을 복사
        int[] arr3 = {9, 3, 0, 4, 2};
        int[] arr4 = arr3; //참조값(주소값)만 복사되어 arr4에 넘어감

        System.out.println(Arrays.toString(arr3)); //둘다 다른 배열이지만 같은 내부 값을 가지는 것으로 보이나, 결국 둘다 같은 값을 가르키고있다.
        System.out.println(Arrays.toString(arr4));

        arr4[0] = 10;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = {5, 6, 7, 1, 2};
        int[] arr6 = Arrays.copyOf(arr5, arr5.length); //arr5의 내부값이 arr6으로 복사됨, 참조값(주소)는 각자 다름

        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        arr5[0] = 50;

        System.out.println(Arrays.toString(arr5)); //이제는 안바뀜
        System.out.println(Arrays.toString(arr6));
    }
}
