package algori.algo26;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int num1[] = new int[3];
        int num2[] = new int[3];

            num1[0] = a % 10;
            num1[1] = ((a % 100) - num1[0]) / 10;
            num1[2] = (a - (num1[1] * 10 - num1[0])) / 100;

            num2[0] = b % 10;
            num2[1] = ((b % 100) - num2[0]) / 10;
            num2[2] = (b - (num2[1] * 10 - num2[0])) / 100;


        int transA = 0;
        int transB = 0;
        int ten1 = 1;
        int ten2 = 1;

        for(int i=num1.length-1;i>=0;i--) {
            transA += num1[i]*ten1;
            ten1*=10;
        }

        for(int i=num2.length-1;i>=0;i--) {
            transB += num2[i]*ten2;
            ten2*=10;
        }

        if(transA>transB)
            System.out.println(transA);
        else
            System.out.println(transB);
    }
}
