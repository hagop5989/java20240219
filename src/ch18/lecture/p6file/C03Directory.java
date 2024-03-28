package ch18.lecture.p6file;

import java.io.File;

public class C03Directory {
    //디렉토리 만들기
    public static void main(String[] args) {
        String path = "temp/folder1";

        File file = new File(path);
        System.out.println("file.exists() = " + file.exists()); // 존재 여부 - x

        if (!file.exists()) {
            file.mkdir(); // 파일 없으면 directory 만들기
        }
        System.out.println("file.exists() = " + file.exists()); // 존재 여부 - o
        System.out.println("file.isDirectory() = " + file.isDirectory()); // 디렉토리 존재여부- o
    }
}
