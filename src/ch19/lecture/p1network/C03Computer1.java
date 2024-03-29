package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    //Server
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) { //반복문 생성
            Socket socket = serverSocket.accept(); // accept 되기전엔 대기함
            Thread t = new Thread(() -> { // 반복문 내 쓰레드 생성
                try {
                    FileInputStream fis = new FileInputStream("temp/dog.png");
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    OutputStream os = socket.getOutputStream();

                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = bis.read(buffer)) != -1) {
                        os.write(buffer, 0, bytesRead);
                    }
                    bis.close();
                    os.flush();
                    os.close();
                    socket.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            });
            t.start();
        }
    }
}
