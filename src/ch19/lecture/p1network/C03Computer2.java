package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    //Client
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.86", 9000);
        InputStream is = socket.getInputStream();

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("temp/dogCopy07.png"));

        byte[] buffer = new byte[1024];
        int byteRead;

        while ((byteRead = is.read(buffer)) != -1) {
            bos.write(buffer, 0, byteRead);
        }
        bos.flush();
        bos.close();
        socket.close();
        System.out.println("수신완료");
    }
}
