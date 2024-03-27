package ch18.sec06;

import java.io.*;

public class test {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("temp/output3.txt");
        try {
            char[] arr1 = {'a', 'b', 'c', 'd'};
            System.out.println(reader.read(arr1)); // arr1의 배열길이인 4 출력
        } catch (Exception e) {
        }
    }
}
