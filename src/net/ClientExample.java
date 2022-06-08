package net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
     public static void main(String[] args) {

         // Socket 변수 선언!
         Socket socket = null;

         try {
             // socket생성.
             socket = new Socket();
             // 연결하자!
             System.out.println("[연결 요청]");
             socket.connect(new InetSocketAddress("localhost", 9090));
             System.out.println("[연결 성공]");
         } catch (Exception e) {
             e.printStackTrace();
         }

         if(!socket.isClosed()){
                 try {
                     socket.close();
                 } catch (IOException e) {
                 }
             }
         }
     }

