package algori.algo25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < 10) {
            number = number * 10;
        }
        int left = 0;
        int right = 0;
        int cnt = 0;
        int sum = number;

        while(true) {
             right = sum % 10;
             left = sum / 10;
             sum = right + left;

             if(sum >= 10)
                sum = sum%10;

             sum = right*10 + sum;
             cnt++;

             if(sum == number)
                 break;
        }
        System.out.println("cnt : " + cnt);
    }
}
