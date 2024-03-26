package ch14.ex;

public class test {
    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt"};
        Thread t1 = new Thread(() -> {
            System.out.println("파일 처리 시작: " + fileNames[0]);
            try {
                Thread.sleep(1000);
                System.out.println("파일 처리 완료: " + fileNames[0]);
            } catch (Exception e) {
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("파일 처리 시작: " + fileNames[1]);
            try {
                Thread.sleep(1000);
                System.out.println("파일 처리 완료: " + fileNames[1]);
            } catch (Exception e) {
            }
        });

        t1.start();
        t2.start();
        // 각 파일 처리 작업을 수행하는 쓰레드 생성 및 시작 로직 작성
        // 여기에 코드를 작성하세요.

        // 모든 쓰레드가 작업을 완료할 때까지 대기하는 로직 작성
        // 여기에 코드를 작성하세요.
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println("모든 파일 처리 완료!");
    }
}

//파일 처리 시작: file1.txt
//파일 처리 시작: file2.txt
//파일 처리 시작: file3.txt
//파일 처리 시작: file4.txt
//파일 처리 시작: file5.txt
//파일 처리 완료: file1.txt
//파일 처리 완료: file2.txt
//파일 처리 완료: file3.txt
//파일 처리 완료: file4.txt
//파일 처리 완료: file5.txt
