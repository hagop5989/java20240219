package ch15.lecture.ex.testgpt;

import java.util.Arrays;
import java.util.Comparator;

public class test2 {
    public static void main(String[] args) {
        int[] a = {1,2,4,3,5,6,22,9};
        System.out.println(largestNumber(a));
    }

    public static String largestNumber(int[] nums) {
        String[] numAsStr = new String[nums.length];

        // 숫자를 문자열로 변환
        for (int i = 0; i < nums.length; i++) {
            numAsStr[i] = String.valueOf(nums[i]);
        }

        // 두 문자열을 연결한 값이 더 큰 순서로 정렬
        Arrays.sort(numAsStr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // 정렬된 문자열 배열을 결합하여 결과 문자열 만들기
        StringBuilder largestNumStr = new StringBuilder();
        for (String numStr : numAsStr) {
            largestNumStr.append(numStr);
        }

        // 만약 가장 큰 숫자가 0이라면, 결과는 "0"
        if (largestNumStr.charAt(0) == '0') {
            return "0";
        }

        return largestNumStr.toString();
    }
}