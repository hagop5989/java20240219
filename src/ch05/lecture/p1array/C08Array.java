package ch05.lecture.p1array;

public class C08Array {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 10, 11, 10, 15, 21};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
