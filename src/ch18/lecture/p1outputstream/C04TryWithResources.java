package ch18.lecture.p1outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04TryWithResources {
    public static void main(String[] args) {
        // close 메소드 호출을 위한 코드 줄이기 문법

        String fileName = "temp/output4.data";

        // try-with-resources 문법
        // try () 괄호 안에서 선언된 객체는 자동으로 close 메소드를 호출해줌(finally블럭에서, exception도 처리해줌)
        try (OutputStream os = new FileOutputStream(fileName);) {
            os.write(2938482);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
