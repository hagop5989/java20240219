package c02.lecture.p02type;

public class C14TextBlock {
    public static void main(String[] args) {
        /*
        """
        <html>
            <head>
                <title></title>
            </head>
            <body>
                <h1>페이지 제목</h1>
                <p> aaaaaaaaaaaaaaaaa </p>
            </body>
         </html>
         """
        */

        // text block
        // """로 묶음
        // newline 따옴표 등을 탈출문자 없이 사용 가능하다.
        String html2 = """ 
                <html>
                   <head>
                       <title>00</title>
                   </head>
                   <body>
                       <h1>페이지 제목</h1>
                       <p> aaaaaaaaaaaaaaaaa </p>
                   </body>
                </html>
                       
                              
                             """;

        System.out.println(html2);

    }
}
