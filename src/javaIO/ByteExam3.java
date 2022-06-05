package javaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
    public static void main(String[] args) {
        try(
                //File에 쓰고 싶다..!
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ){

            //다양한 형식으로 Overloading 하고 있다.
            out.writeInt(100);
            //정수는 4byte!
            out.writeBoolean(true);
            // boolean은 1byte! 저장!
            out.writeDouble(50.5);
            // double은 8byte를 저장!

        }catch(Exception e ){
            e.printStackTrace();
        }



    }
}
