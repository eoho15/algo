package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/javaIO/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            // 읽어들인 수를 저장하기 위해 사용!
            // 512 바이트 만큼 읽어 들여야 한다.
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer)) != -1){
                fos.write(buffer,0,readCount);
            }

        } catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
