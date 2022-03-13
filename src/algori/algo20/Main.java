package algori.algo20;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i=1; i<number+1; i++) {
            if( i%3==0){
                System.out.print("짝 ");
            }

            else
                System.out.print(i + " ");
        }
    }
}
