package algori.algo14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int k = 0;
        int arr[] = new int[10];

        while(number>0) {
            arr[number % 10]++;
            number = number/10;
        }
        for(int i=0;i<arr.length;i++)
            System.out.println(i + ":" +arr[i]);
     }
}
