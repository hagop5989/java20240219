package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C05Computer2 {
    //학생
    public static void main(String[] args) throws IOException {
        // 서버에 연결해서 Socket 생성
        Socket socket = new Socket("172.30.1.86", 9000);
        // 키보드 입력용 Scanner 만들고

        try (socket) {
            // Socket 에서 OutputStream 꺼내고
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try (scanner; os; osw; bw; pw) {
                // 키보드에서 입력한 내용을
                // OutputStream 에 출력
                while (true) {
                    System.out.print("입력>");
                    String message = scanner.nextLine();
                    pw.write(message);
//                    pw.println(message);
                    pw.flush();
                    if (message.equals("bye")) {
                        break;
                    }
                }
            }
        }
    }
}
