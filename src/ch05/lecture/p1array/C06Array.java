package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[]{6, 3, 2, 1, 3, 45, 10, -10, -2, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("arr[]의 개수는: " + arr.length);
    }
}
