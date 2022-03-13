package algori.algo23;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String data = scan.nextLine();
            System.out.println("원래 문자열:"+data);
            String revers = "";

            for(int i=data.length()-1; 0<=i; i--) {
                revers += data.charAt(i);
            }
            System.out.println(revers);
        }
}
