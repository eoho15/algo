package webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        // 클라이언트가 접속할 때까지 대기할때 필요한 객체가 ServerSocket;
        ServerSocket serverSocekt = new ServerSocket(10000);
        System.out.println("1");
        try {
            while (true) {
                Socket clientSocket = serverSocekt.accept();
                System.out.println("2");
                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocekt.close();
        }
    }
}

class ClientThread extends Thread{
    private Socket clientSocket;
    public ClientThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    public void run(){
        try{
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));
            //        System.out.println(br.readLine());
            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0)
                msg = "hello";
            else if (firstLine.indexOf("/hi") >= 0)
                msg = "hi";

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }
            // 빈줄까지 읽어들이면 끝
            System.out.println("3 - 응답을 한다.");

            pw.println("HTTP/1.1 200 OK"); // 응답
            pw.println("name : kim"); // 응답
            pw.println("email:eoho115@naver.com"); // 응답
            pw.println();
            pw.println("<html>"); // 응답
            pw.println(firstLine + "!!!"); // 응답
            pw.println("</html>"); // 응답

            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
