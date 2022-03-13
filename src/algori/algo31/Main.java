package algori.algo31;

import java.util.Scanner;

public class Main {
    // 탈출 조건이 필요하다!!
    public static int calFact(int i) {
        if(i==1){
            return 1;
        }
        return i*calFact(i-1);
    }

    public static void main(String[] args) {
        //입력된 수의 팩토리얼을 구하세요.
        int input;
        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        int ans = 0;

        ans = calFact(input);
        System.out.println(ans);

    }
}
