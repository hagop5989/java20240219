package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "temp/test.png";
        String targetFileName = "temp/test2.png";

        try {
            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName);

            try (is; os;) {
                byte[] data = new byte[1024];
                while (true) {
                    int num = is.read(data);
                    if (num == -1) break;
                    os.write(data, 0, num);
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("복사가 잘 되었습니다.");
    }
}
