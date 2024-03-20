package ch15.lecture.p3stack;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class Leetcode102 {
    //이진 트리가 주어지면 해당 노드 값의 레벨 순서 순회를 반환합니다 . (즉, 왼쪽에서 오른쪽으로, 레벨별로).
    //입력: 루트 = [3,9,20,null,null,15,7]
    // 출력: [[3],[9,20],[15,7]]
    public static void main(String[] args) {

        Integer[] root = {3, 9, 20, null, null, 15, 7};
        ArrayList<Integer> intArr = new ArrayList<>();
        Integer temp = root[0];

        intArr.add(root[0]);
        for (Integer i : root) {
            if (i != null) {
                if (i > temp) {
                    intArr.add(i);
                    temp = i;
                } else {
                    intArr.remove(temp);
                    intArr.add(i);
                    intArr.add(temp);
                    temp = i;
                }
            }
        }
        intArr.remove(root[0]);
        System.out.println(intArr);
    }
}
