package ch05.lecture.p1array.sec06;

public class test {
    public static int[] main(String[] args) {

        int[] array = new int[]{1, 2, 1};
        int[] array2 = new int[(array.length) * 2];
        int i = 0;
        int j = 0;

        for (i = 0, j = 0; i < 6; i++, j++) {
            if (j > 2) {
                j = 0;
            }
            array2[i] = array[j];
        }
        return array2;
    }
}
