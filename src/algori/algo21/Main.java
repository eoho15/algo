package algori.algo21;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("입력수 : ");
            int number = sc.nextInt();
            int[] user = new int[number];
            int n = 0;
            for (int i = 0; i < number; i++) {
                user[n] = sc.nextInt();
                while (user[n] < 0 || 100 < user[n]) {
                    System.out.println("1~100 까지 숫자를 입력해주세요");
                    user[n] = sc.nextInt();
                }
                n++;
            }

            for (int i = 0; i < number - 1; i++) {
                for (int j = 0; j < number - 1 - i; j++) {
                    if (user[j] > user[j + 1]) {
                        int tmp = user[j];
                        user[j] = user[j + 1];
                        user[j + 1] = tmp;
                    }
                }
            }
            int [] answer = new int[number];
            int cnt = 0;
            for (int i = 0; i < number; i++) {

                if (i == 0  || user[i] != user[i - 1] ) {
                    answer[cnt] = user[i];
                    cnt++;
                }
            }

            for(int i =0; i<cnt; i++)
                System.out.print(answer[i] + " ");

        }
    }