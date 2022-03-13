package algori.algo15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //구구단 시작 s부터 f까지 입력 받아 아래와 같이 출력하세요.
        // 입력 : 2, 3
        // 정답:
        //  2  * 1 = 2,    3 * 1 = 3;
        //  2  * 2 = 4,    3 * 2 = 6;
        //  2  * 3 = 6,    3 * 3 = 9;
        //  2  * 4 = 8,    3 * 4 = 12;
        //  2  * 5 = 10,   3 * 5 = 15;
        //  2  * 6 = 12,   3 * 6 = 18;
        //  2  * 7 = 14,   3 * 7 = 21;
        //  2  * 8 = 16,   3 * 8 = 24;

        System.out.println("원하시는 단을 입력해 주세요, ex) 2단부터 ~ 9단  ->  2 9");
        System.out.print("입력:");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for(int j=num1; j<=num2; j++) {
            for (int i = 1; i < 10; i++) {
                System.out.println(num1 + "*" + i + "=" + num1 * i);
            }

            num1++;
            System.out.println();

            }
        }
    }
