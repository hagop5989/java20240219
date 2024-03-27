package codingtest.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class T240314_0 {
    public static void main(String[] args) {
        int size = 5;
        int dSize = 2;
        Integer arr[] = {1,2,3,4,5};
        int del[] = {2,4};
        System.out.println(Arrays.toString(arr));


        ArrayList<Integer> arrayList = new ArrayList<>(asList(arr));
        int indexToRemove = 2;
        arrayList.remove(indexToRemove);
        System.out.println("변경된 배열: " + arrayList);


//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(del));
        for(int i=0; i<dSize; i++) {
            for(int j =0; j<size; j++) {
                if (arr[j] == del[i]) {
                    arr[j] = arr[j+1];
                    System.out.println("i = " + i + ",j = "+ j);
                    size--;
                }
            }
        }

    }
}
