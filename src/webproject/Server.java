package webproject;

import java.io.IOException;
import java.io.InputStream;
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
             ServerSocket serverSocket = new ServerSocket(port);

             // serverSocket.accept(); 를 하게 되면 socket이 반환된다.
             Socket socket = serverSocket.accept();
             System.out.println("socket주소"+ socket.getInetAddress());
             // 입력받았음.
             InputStream inputStream = socket.getInputStream();
             inputStream.transferTo(System.out);

             socket.close();

         }catch(IOException e){
             e.printStackTrace();
         }
     }
}
