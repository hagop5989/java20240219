package codingtest.thisistest;

import java.util.ArrayList;

public class Ch03P02 {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 3;
        int[] arr = {2, 4, 5, 4, 6};
        int max = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i : arr) {
            arrayList.add(i);
        }
        arrayList.sort((a,b)->b-a);
        max  = arrayList.get(0);
        int maxSecond = arrayList.get(1);





    }
}
