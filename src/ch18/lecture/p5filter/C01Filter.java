package ch18.lecture.p5filter;

import java.io.*;
import java.util.stream.IntStream;

public class C01Filter {
    public static void main(String[] args) throws IOException {
        // 어떤 I/O stream 을
        // 다른 I/O stream 으로 변경해서 사용할 수 있다.

        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);
        // InputStream Reader :
        // byte stream을 character stream 으로 연결
        Reader reader = new InputStreamReader(is);


//        int data1 = is.read(); // 1byte -> 글자가 잘안나옴(ê)
        int data1 = reader.read(); // 정상적으로 나옴(걱)
        System.out.println((char) data1);

        is.close();
    }
}
