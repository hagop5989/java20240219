package ch18.ex.p08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            try (fw) {
                fw.write("java");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
