package algori.algo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int[] inputNum = new int[0];

        System.out.println("숫자 10개를 입력해 주세요!");
        for (int i = 0; i < 10; i++) {
            inputNum[i] = scan.nextInt();
        }

        int[] mode = new int[10];

        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 나온 횟수

        for (int i = 0; i < 10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수는:" + modeNum + "cnt:" + modeCnt);

    }
}

