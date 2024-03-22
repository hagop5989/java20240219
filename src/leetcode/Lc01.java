package leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class Lc01 {
    //정수 배열 nums 과 정수가 주어지면 두 숫자의 합이 가 되는 인덱스를 target 반환합니다 .target
    //각 입력에는 정확히 하나의 솔루션이 있다고 가정할 수 있으며 동일한 요소를 두 번 사용할 수 없습니다 .
    //어떤 순서로든 답변을 반환할 수 있습니다.

    //예시 1:
    //입력: nums = [2,7,11,15], target = 9
    // 출력: [0,1]
    // 설명: nums[0] + nums[1] == 9이므로 [0, 1]을 반환합니다.
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        IntStream stream = Arrays.stream(nums);
        Stack<Integer> stack = new Stack<>();
        int[] array = stream
                .filter(a -> Arrays.stream(nums).anyMatch(b -> a + b == target))
                .toArray();
        for (int i : array) {
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    stack.add(j);
                }
            }
        }
        stack.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("stack = " + stack);
    }
}
