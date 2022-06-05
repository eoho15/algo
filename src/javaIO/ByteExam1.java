package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("src/javaIO/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            while((readCount = fis.read())!=-1){
                fos.write(readCount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
