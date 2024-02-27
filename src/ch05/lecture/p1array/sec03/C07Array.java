package ch05.lecture.p1array.sec03;

public class C07Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        // 향상된 for 문
        int[] arr = new int[]{6, 4, 2, 1, 2, 3, -1, 2, 0};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(STR."arr의 개수: \{arr.length}");
    }
}
