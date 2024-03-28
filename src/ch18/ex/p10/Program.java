package ch18.ex.p10;

import java.io.*;

//원본 파일 없을 시 "원본 파일이 존재하지 않습니다." 를 출력 -exist
// 복사 파일 경로 디렉토리 존재하지 않으면 경로상 모든 디렉토리를 자동 생성 - mkdirs
// 복사 성공 시 "복사가 성공되었습니다." 출력
public class Program {
    public static void main(String[] args) throws IOException {
//        String startPath = "temp/dir1/photo1.jpg";
//        String desPath = "temp/dir2/photo2.jpg";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("원본 파일 경로 입력: ");
        String startPath = br.readLine();
        System.out.print("목적 파일 경로 입력: ");
        String desPath = br.readLine();

        File file1 = new File(startPath);
        File file2 = new File(desPath);
        File dir1 = file1.getParentFile();
        File dir2 = file2.getParentFile();

        // 1번 파일 확인
        if (!file1.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            if (!dir1.exists()) {
                System.out.println("dir1 디렉토리가 존재 하지 않습니다");
                dir1.mkdirs();
            }
            file1.createNewFile();
            System.out.println(file1.getName() + " 생성이 성공되었습니다.");
        }
        // 2번 파일 확인
        if (!dir2.exists()) {
            System.out.println("dir2 디렉토리가 존재 하지 않습니다");
            dir2.mkdirs();
        }
        copy(startPath, desPath, file2);
    }

    private static void copy(String startPath, String desPath, File file2) throws IOException {
        InputStream is = new FileInputStream(startPath);
        BufferedInputStream bis = new BufferedInputStream(is);
        FileOutputStream os = new FileOutputStream(desPath);
        BufferedOutputStream fos = new BufferedOutputStream(os);

        byte[] data = new byte[100];
        int len = 0;
        while ((len = bis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        System.out.println(file2.getName() + " 복사가 성공되었습니다.");
    }

}
