package ch18.lecture.p1outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C03Close {
    public static void main(String[] args) {
        String fileName = "temp/output3.data";

        OutputStream os = null; // try괄호 안에 놓으면 다른데서 못쓰니 바깥에 선언하고 null
        try {
            os = new FileOutputStream(fileName);
            // 데이터 출력 작업
            os.write(293993);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야만 함!! , finally 블럭에 작성할만한 것.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
