package ch18.lecture.p6file;

import java.io.File;

public class C04Directory {
    public static void main(String[] args) {
        String path = "temp/folder2/sub1/sub2"; // folder2/sub1/sub2 각각 하나도 없음
        File file = new File(path);

        System.out.println("file.exists() = " + file.exists()); // false

        if (!file.exists()) {
            file.mkdirs(); // 상위 폴더까지 한번에 생성 (mkdir"s")
        }
        System.out.println("file.exists() = " + file.exists()); // true
    }
}
