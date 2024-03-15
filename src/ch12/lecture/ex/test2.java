package ch12.lecture.ex;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        String myString = "dd xb v xaaxcrx";
        myString = myString.replaceAll("\\s", "");
        String[] tokens = myString.split("x");
        Arrays.sort(tokens);
        System.out.println(Arrays.toString(tokens));
    }
}
