package algori.algo8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("팩토리얼 할 숫자를 입력해 주세요!");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(factorial(number));
    }

    public static int factorial(int number) {
        if(number <= 1)
            return number;
        else
            return factorial(number-1) * number;
    }


}
