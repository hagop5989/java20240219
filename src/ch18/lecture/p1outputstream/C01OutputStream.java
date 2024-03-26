package ch18.lecture.p1outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        // InputStream :
        // 프로그램 외부 입력을 바이트 단위로 받기 위한 객체 클라스
        // OutputStream :
        // 프로그램 외부 출력을 바이트 단위로 하기 위한 객체 클라스


        // Reader : 문자단위 입력 스트림
        // Writer : 문자단위 출력 스트림

        String fileName = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(99); // 1byte만 써줌
        os.write(100); // 1byte만 써줌
        os.write(100_000_000); // 1byte만 써줌// 너무 커서 다 안들어감
    }
}
