package webproject;

import webproject.http.HttpMethod;
import webproject.http.HttpVersion;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int port;
    public Server(int port){
        this.port = port;
    }

    public void run(){
         try {
             //port를 초기화 안했기 때문에 위에 int port; 에서 초기화를 해주어야 한다.
             // 지정된 port로 server소켓을 연다.
             ServerSocket serverSocket = new ServerSocket(port);

             Socket socket = serverSocket.accept();


             // new BufferedReader() 에 넣을 인자는 byte

             // InputStreamReader에 넣을 인자는  bufferdInputStream
             BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
             InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
             // 아래와 같은 코드는 한줄씩 읽기 위해서 사용.
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

             // Header 부분은 위와 같이 처리하면 읽어진다

             // Body부분은 조금 더 구체적인 로직이 요구된다.


             // bufferedReader로 첫번째 줄을 읽어보자.
             String startLine = bufferedReader.readLine();
             // "GET / HTTP / 1.1";
             String[] token = startLine.split(" ", 3);
             if(token.length < 3){

                 throw new HttpRequsetParsingFailedException("잘못된 start line이 들어왔습니다.");
              }

             String methodString = token[0];
             String requestTarget = token[1];
             String versionString = token[2];

             HttpMethod method;
             try {
                 method = HttpMethod.valueOf(methodString);
             } catch(IllegalArgumentException e){
                throw new HttpRequsetParsingFailedException("잘못된 method가 들어왔습니다.",e);
             }

             if(versionString.equals("HTTP/1.1")){
                 System.out.println("버전이 1.1이 아닙니다.");
                throw new HttpRequsetParsingFailedException("버전이 1.1이 아닙니다.");
             }

             HttpVersion version = HttpVersion.VERSION_1_1;



             socket.close();

         }catch(IOException e){
            throw new DaehoException("IO 문제가 발생했습니다,", e);
         }
     }
}
