package algori.algo32;

import java.util.Scanner;

public class Main {

    // 1 3 => 1+2+3 의 결과값인 6이 나와야한다!!
    // 탈출 조건을 꼭 명시해야한다!!
    public static int calAccSum(int start, int end) {

        if(start == end){
             return start;
        }
        return start + calAccSum(start+1, end);
    }


    public static void main(String[] args) {
        // 입력된 두 수까지의 합을 구하시오..!!
        // ex) 14
        int start;
        int end;
        Scanner scan = new Scanner(System.in);

        start = scan.nextInt();
        end = scan.nextInt();

        int ans = 0;

        ans = calAccSum(start, end);
        System.out.println("acc sum = " + ans);




    }
}
