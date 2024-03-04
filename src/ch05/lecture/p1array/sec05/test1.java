package ch05.lecture.p1array.sec05;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        String my_string = "bdbsdvcczasceqsdg";
        String s1 = my_string.toLowerCase();
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);

    }
}
