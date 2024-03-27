package ch18.lecture.p5filter;

import java.io.*;

public class C02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output2.txt";
        OutputStream os = new FileOutputStream(file);

        // OutputStreamWrite :
        // 문자단위 출력 스트림을 바이트 단위 출력 스트림 연결

        OutputStreamWriter osw = new OutputStreamWriter(os);

        char c1 = 'A';
        osw.write(c1);

        char c2 = '가';
        osw.write(c2);

        os.close();
        osw.close();
    }
}
