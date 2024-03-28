package ch18.lecture.p6file;

import java.io.File;

public class C01File {
    public static void main(String[] args) {
        String path = "src/ch18/lecture/p6file/C01File.java";
        File file = new File(path);

        long size = file.length();
        System.out.println("size = " + size); // 파일의 크기

        boolean exists = file.exists();
        System.out.println("exists = " + exists); // 파일의 존재 여부

        boolean directory = file.isDirectory(); // 디렉토리(폴더)인지?
        System.out.println("directory = " + directory);

        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath); // 파일의 절대경로 파악

        String fileParent = file.getParent();
        System.out.println("fileParent = " + fileParent); // 부모파일

    }
}
