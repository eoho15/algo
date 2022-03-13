package algori.algo11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int arr[][] = new int[number][number];
        int k = 0;
        for(int i=0;i<number;i++) {

            if(i%2 == 0) {
                for (int j = 0; j < number; j++) {
                    k = k+1;
                    arr[i][j] = k;
                }
            }

            else {
                for (int j = number - 1; j >= 0; j--) {
                    k = k+1;
                    arr[i][j] = k;
                }
            }
        }


        for(int i=0;i<number;i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%4d", arr[i][j]);
            }

            System.out.println();

        }
    }
}
