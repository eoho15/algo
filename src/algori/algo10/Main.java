package algori.algo10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;

        for(int i=0; i<number; i++) {
             for(int j=0;j<number;j++) {
                 System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}
