package net;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleWebServer {
    public static void main(String[] args) throws Exception {
        // 1. 서버는 클라이언트를 기다린다.
        // 2. 클라이언트가 접속하면, 해당 클라이언트와 통신할 수있는 Socket이 반환된다.
        // 3. Socket이 반환되면 클라이언트와 통신하는 Thread를 만들어서 작업을 처리하게 된다.
        // 4. 1번부터 다시 시작한다.
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("Server Start!!");
        while (true) {
            Socket socket = ss.accept();
            System.out.println("client:" + socket);
            SocketThread st = new SocketThread(socket);
            st.start();
        }
    }
}

class SocketThread extends Thread{
    Socket socket;
    public SocketThread(Socket socket){
        this.socket = socket;
    }
    // 브라우저의 요청을 처리하는 메소드..
    @Override
    public void run() {
        System.out.println("socket을 통해 클라이언트와 동작한다.");
        try {
            // 브라우저에서 정보를 얻고, 내보내는 역할을 한다!
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); // 한줄씩 socket쓰는 객체
            BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 한줄씩 socket에서 읽는 객체
            // 브라우저의 요청을 읽어들여서 그 결과를 반환한다. 
            Request request = processRequest(in,br);
            System.out.println(request.getFirstLine());
            System.out.println(request.getPath());

            //응답한다.
            // path의 내용을 읽어들여서 클라이언트에 전송한다.
            processResponse(request.getPath(), out, pw);

            socket.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    } // run

    private void processResponse(String path, OutputStream out, PrintWriter pw) {
        String baseDir = "C:\\Users\\handa\\Desktop\\algo\\src\\net";
        String readFile = baseDir + path;

    }

    // 몇번째 듣는지 모르게따,,
    private Request processRequest(InputStream in, BufferedReader br) throws Exception {
        //Request 객체 생성.
        Request request = new Request();
        request.setFirstLine(br.readLine()); // GET / HTTP / 1.1
        String line = null;
        while (!(line = br.readLine()).equals("")) {
            request.addHeaders(line);
        }
        return request;
    }
}

class Request {
    String firstLine; // GET
    List<String> headers;
    String path;

    public Request(){
        headers = new ArrayList<>();
    }
    // String과 headers로 읽어 들인다!

    public String getFirstLine(){
        return firstLine;
    }

    public String getPath() {
        return path;
    }

    public void setFirstLine(String firstLine){
        this.firstLine = firstLine;
        this.path = firstLine.substring(4, firstLine.lastIndexOf(" "));
        if ("/".equals(path)) {
            path = "/index.html";
        }
    }

    public void addHeaders(String header){
        headers.add(header);
    }

    public Iterator<String> getHeaders(){
        return headers.iterator();
    }
}

