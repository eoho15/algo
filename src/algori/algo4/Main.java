package algori.algo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("십진수를 입력해 주세요!!");
        int inputNum= scan.nextInt();
        String tempStr = "";
        String binStr;

        int temp = inputNum;
        int reminder;

        while(true) {

            reminder = temp % 2;
            temp = temp / 2;
            tempStr = reminder + tempStr;

            if(temp == 0) {
                break;
            }
        }
       // binStr = tempStr;
        System.out.println(tempStr);
    }
}