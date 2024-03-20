package ch15.lecture.p3stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode1700 {
    public static void main(String[] args) {
        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        Queue<Integer> stuQue = new LinkedList<>();
        Queue<Integer> sandQue = new LinkedList<>();
        for (Integer i : students) {
            stuQue.offer(i);
        }
        System.out.println(stuQue);

        for (int j : sandwiches) {
            sandQue.offer(j);
        }
        System.out.println(sandQue);

        while (!sandQue.isEmpty() && stuQue.contains(sandQue.peek())) {
            if (sandQue.peek().equals(stuQue.peek())) {
                sandQue.poll();
                stuQue.poll();
            } else {
                stuQue.offer(stuQue.poll());
            }
        }
        System.out.println("stuQue = " + stuQue);
        System.out.println("stuQuesize:" + stuQue.size());
    }


}
