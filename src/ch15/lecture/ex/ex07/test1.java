package ch15.lecture.ex.ex07;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        System.out.println(getRow(2).toArray());
    }


    public static List<Integer> getRow(int rowIndex) {
        rowIndex = 3;
        List<Integer> list1 = getRow(rowIndex);
        for (int i = 1; i < rowIndex; i++) {
            for(int j=0; j<i; j++){
                list1.add(1);
            }
        }


        return null;
    }

//public static List createList(int rowNum,String name){
//
//}
}

