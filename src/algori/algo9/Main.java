package algori.algo9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("각자리수의 합할 숫자를 입력해주세요");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(f(number));

    }

    private static int f(int number) {
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number = number / 10;
    }

            return sum;
    }
}




