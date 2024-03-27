package ch18.lecture.p1outputstream;

import java.io.*;

public class C06EffectivelyFinal {
    public static void main(String[] args) throws IOException {
        String inputFilename = "temp/input5.data";
        String outputFilename = "temp/output5.data";

        InputStream is = new FileInputStream(inputFilename);
        OutputStream os = new FileOutputStream(outputFilename);
        try (is; os;) {
            //try with resources 문법에 사용된 변수는 final 또는 effectively final 이어야 함.
//            is = new FileInputStream(inputFilename); // <-다만 다시 할당할 수는 없음.
            //읽는 작업
            is.read();
            //쓰는 작업
            os.write(23232);
        }
    }
}
