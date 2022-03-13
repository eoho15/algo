package algori.algo12;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는
        // 숫자 사각형을 출력하시오.
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int arr[][] = new int[number][number];
        int numm = number+1;
        int k = 0;

        for(int i=0;i<number;i++) {
            k = k+1;
            for(int j = 0; j < number; j++) {
                arr[i][j] = k + number * j;
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
