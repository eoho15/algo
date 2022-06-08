package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception{
        // 9090 port로 대기한다.
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();

        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        // out을 통해 만드는
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        // 빈줄을 만나면 whiel문을 끝낸다.
        while(!(line = br.readLine()).equals("")){
            headers.add(line);
        }
        // 요청정보 읽기가 끝난다.
        System.out.println(firstLine);
        for(int i=0;i<headers.size();i++){
            System.out.println(headers.get(i));
        }

        pw.println("HTTP/1.1 200 OK");
        pw.println("name: han");
        pw.println("email: urstory@gmail.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!");
        pw.println("</html!>");
        pw.close();

        ss.close();
        System.out.println("서버가 종료 됩니다.");
        // server 소켓은 다 사용하면 close를 해줘야 한다.
    }
}
