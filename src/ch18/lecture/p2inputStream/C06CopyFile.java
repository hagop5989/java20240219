package ch18.lecture.p2inputStream;

import java.io.*;
import java.sql.Time;

public class C06CopyFile {
    public static void main(String[] args) {
        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dogcopy.png";

        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);
            try (is; os) {

                byte[] data = new byte[10];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
