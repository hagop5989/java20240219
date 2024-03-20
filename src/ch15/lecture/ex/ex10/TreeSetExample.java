package ch15.lecture.ex.ex10;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        TreeSet<Student> treeSet = new TreeSet<Student>((a, b) -> a.score - b.score);
//        treeSet.add(new Student("blue", 96));
//        treeSet.add(new Student("hong", 86));
//        treeSet.add(new Student("white", 92));
//
//        Student student = treeSet.last();
//        System.out.println("최고 점수 :" + student.score);
//        System.out.println("최고 점수를 받은 아이디 :" + student.id);

        int a = 1231232;
        int sum = 0;
        String b = String.valueOf(a);
        String[] c = b.split("");
        System.out.println(Arrays.toString(c));
        for (String s : c) {
            sum += Integer.valueOf(s);
        }
        System.out.println(sum);


    }
}
