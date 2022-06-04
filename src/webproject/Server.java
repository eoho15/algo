package webproject;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int port;

    public Server(int port) {
        this.port = port;
    }

    public void run(){
        try {
        ServerSocket serverSocket = new ServerSocket(port);

        Socket socket = serverSocket.accept();
        System.out.println(socket.getInputStream());

        InputStream inputStream = socket.getInputStream();
        inputStream.transferTo(System.out);

        socket.close();

    }catch (IOException ioException) {
            System.out.println("IO 문제가 발생했습니다.");
        }
    }
}
