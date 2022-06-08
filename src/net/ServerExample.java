package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        try{
            // 서버 소켓 객체 만들기.
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 9090));

            // 서버는 항상 클라이언트의 요청을 기다려야 한다.
            while(true){
                System.out.println("[연결 기다림]");
                // 서버 소켓의 객체를 만들어서, 기다린다.
                Socket socket = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("연결 수락함." + isa.getHostName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        // 서버가 닫혀있지 않다면 닫히는 코드
        if(!serverSocket.isClosed()){
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
