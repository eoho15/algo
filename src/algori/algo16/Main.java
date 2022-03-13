package algori.algo16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 다음 입력 n을 받아 아래와 같은 *을 출력하세요.
        // 입력: 5
        // 정답:
        // *
        // **
        // ***
        // ****
        // *****
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i=0;i<number;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
