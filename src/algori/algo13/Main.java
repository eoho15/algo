package algori.algo13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int arr[][] = new int[number][number];
        int k = 0;

        for (int i = 0; i < number; i++) {
            k = k+1;
            for (int j = 0; j < number; j++){
                arr[i][j] = k * (j+1);

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
