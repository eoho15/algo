package baekjoon.solution;

import algori.algo30.Main;

import java.util.Scanner;

public class baekjoon_1001 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a-b;

        System.out.println(c);

    }
}
