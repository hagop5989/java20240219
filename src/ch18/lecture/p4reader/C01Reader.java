package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        // InputStream: "바이트" 단위 입력 스트림
        // Reader : "문자" 단위 입력 스트림

        Reader reader = new FileReader("temp/output2.txt");
        int read1 = reader.read(); // 한번 읽을때마다 int를 리턴 (2byte를 포함한 4byte int를 리턴)
        int read2 = reader.read();
        int read3 = reader.read();
        int read4 = reader.read();

        System.out.println("read1 = " + (char) read1);
        System.out.println("read2 = " + (char) read2);
        System.out.println("read3 = " + (char) read3);
        System.out.println("read4 = " + (char) read4);
    }
}
