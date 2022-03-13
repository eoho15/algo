package algori.algo27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[][] = new int[num][num];
        int cnt = 1;

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                cnt = arr[i][j];
                System.out.print(arr[i][j]);
                cnt++;
            }
            System.out.println();
        }

    }
}
