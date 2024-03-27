package ch18.lecture.p1outputstream;

import java.io.*;

public class C05TryWithResources {
    public static void main(String[] args) {
        String inputFilename = "temp/input5.data";
        String outputFilename = "temp/output5.data";

        try (InputStream is = new FileInputStream(inputFilename);
             OutputStream os = new FileOutputStream(outputFilename);) {
            //읽는 작업
            //쓰는 작업
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
