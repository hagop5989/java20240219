package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
    //서버
    // 응답 메세지 보내기 (요청메세지는 알아서 작성 됨)
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();

        try (socket) {

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw); //1줄 단위로 보여줌
            try (os; osw; bw; pw) {

                // 본문 작성
                String body = """
                        <html>
                            <head>
                                <title>직접 만든 HTML 코드</title>
                            </head>
                            <body>
                                <h1>처음 만들어 본 SERVER</h1>
                                <p>너무 힘들어서 이렇게 못하겠다</p>
                                    <ul>
                                        <li>심플리 키진</li>
                                        <li>모미지 식당</li>
                                        <li>서브웨이</li>
                                    </ul>
                            </body>
                        </html>
                        """;

                // 첫 번째 줄
                pw.println("HTTP/1.1 200 OK");

                // 두 번째 줄 - 헤더시작 //Content type, Content length 가 반드시 들어가야 함
                pw.println("content-type: text/html; charset=utf-8");
                pw.println("cotent-length: " + body.getBytes().length);

                // 한 줄 띄우고
                pw.println();

                // 본문 - 본문 이외는 스프링이 해준다.
                pw.println(body);

                pw.flush();
            }
        }
    }
}
