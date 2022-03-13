package algori.algo17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int k = 0;

        for(int i = 0; i < number; i++) {

            for(int j=0; j < number; j++) {
                if(k<=j-number+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            k--;
            System.out.println();
        }
    }
}