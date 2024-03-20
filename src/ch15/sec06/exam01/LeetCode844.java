package ch15.sec06.exam01;

import java.util.Stack;

public class LeetCode844 {
    public static void main(String[] args) {


        String s = "ab#c";
        String[] s1 = s.split("");
        String t = "ad#c";
        String[] t1 = t.split("");


        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s1[i].charAt(0) != '#') {
                stack1.push(s1[i].charAt(0));
            } else {
                stack1.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t1[i].charAt(0) != '#') {
                stack2.push(t1[i].charAt(0));
            } else {
                stack2.pop();
            }
        }
        String sum1 = "";
        String sum2 = "";
        System.out.println(stack2);
        System.out.println(stack1);
        for (Character c : stack1) {
            sum1 += c;
        }
        for (Character c : stack2) {
            sum2 += c;
        }
        if (sum1.equals(sum2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
