package ch15.lecture.p1list;

import ch08.A;

import java.util.ArrayList;
import java.util.List;

public class C04NestedList {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println(array[1][1]); // 92
        System.out.println(array[2][2]); // 93
        System.out.println(array[1][0]); // 83

        //Todo : 위랑 동일하게 출력
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(95);
        list.get(0).add(86);

        list.get(1).add(83);
        list.get(1).add(92);
        list.get(1).add(96);

        list.get(2).add(78);
        list.get(2).add(83);
        list.get(2).add(93);
        list.get(2).add(87);
        list.get(2).add(88);
        System.out.println(list);

        System.out.println(list.get(1).get(1)); //92
        System.out.println(list.get(2).get(2)); //93
        System.out.println(list.get(1).get(1)); //83

        // 새 객체를 나중에 추가
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> subList1 = new ArrayList<>();
        subList1.add(95);
        subList1.add(92);
        subList1.add(86);
        List<Integer> subList2 = new ArrayList<>();
        subList1.add(83);
        subList1.add(92);
        subList1.add(96);
        List<Integer> subList3 = new ArrayList<>();
        subList1.add(78);
        subList1.add(83);
        subList1.add(93);
        subList1.add(87);
        subList1.add(88);

        list2.add(subList1);
        list2.add(subList2);
        list2.add(subList3);
        
        System.out.println(list2);
    }
}
