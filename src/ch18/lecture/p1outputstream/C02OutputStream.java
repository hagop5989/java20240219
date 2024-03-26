package ch18.lecture.p1outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException, InterruptedException {
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(29374);
        os.write(9748484);

        Thread.sleep(10_000);

        os.write(38383833);
        os.write(23232);

        os.close(); // 꼭 작성해야 함 // 안닫으면 다른 작업이 접근 못할수도 있음
    }
}
