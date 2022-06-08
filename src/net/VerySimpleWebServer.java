package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception {

        // 9191 port로 대기한다.
        ServerSocket ss = new ServerSocket(9191);
        // 클라이언트를 대기
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // http://127.0.0.1:9191/board/hello.html 왼쪽과 같이 입력받았다고 하자.
        System.out.println("클라이언트 접속을 기다립니다.");

        Socket socket = ss.accept();

        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        // HTTP 프로토콜은 클라이언트가 정보를 서버에 보내준다.( 요청 정보)
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        //가장 중요한 Line!
        String firstLine = br.readLine();
        // 줄바꿈 부터, List에 담는다.
        List<String> headers = new ArrayList<>();
        // 빈줄이 나올때 까지 읽어 들이자!
        // 빈 줄을 만나면 while 문을 끝내자.
        String line = null;
        while(!(line = br.readLine()).equals("")){
            headers.add(line);
        }
        // 요청정보 읽기가 끝난다.
        System.out.println(firstLine);
        for(int i=0;i<headers.size();i++){
            System.out.println(headers.get(i));
        }

        pw.println("HTTP/1.1 200 OK");
        pw.println("name : kim");
        pw.println("email: daeeho@naver.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!!</h1>");
        pw.println("</html>");
        pw.close();

        ss.close();
        System.out.println("서버 종료.");

    }
}
