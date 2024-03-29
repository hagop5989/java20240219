package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

// 기다리는 쪽 server , 요청하는쪽 clients
public class C01Computer2 {
    public static void main(String[] args) throws IOException {
        //연결을 요구하는 쪽
        // socket 생성
        Socket socket = new Socket("172.30.1.40", 9000); //  172.30.1.86의 9000번에 요청
        try (socket) {
            // 입력 스트림 데코레이팅.....
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            try (is; isr; br;) {
                String data = br.readLine();
                System.out.println("컴퓨터 1이 보낸 메세지 = " + data);
            }
        }
    }
}
