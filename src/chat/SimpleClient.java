package chat;

import java.io.*;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        InputStream is;
        OutputStream os;
        BufferedReader br_in;
        BufferedReader br_out;
        String inMessage = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        String outMessage = null;

        try{
            Socket s1 = new Socket("127.0.0.1",9090);
            is = s1.getInputStream();
            os = s1.getOutputStream();

            br_out = new BufferedReader(new InputStreamReader(System.in));
            br_in = new BufferedReader(new InputStreamReader(is));
            bw = new BufferedWriter(new OutputStreamWriter(os));
            pw = new PrintWriter(bw, true);

            while (true) {
                inMessage = br_in.readLine();
                System.out.println(inMessage);

                outMessage = br_out.readLine();
                if(outMessage.equals("exit"))
                    break;

                pw.println("client: "+ outMessage);
            }
            pw.close();
            s1.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}