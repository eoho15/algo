package algori.algo24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 학생 수 : ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        int sum=0;
        for(int i =0; i<n; i++){
            scores[i] = sc.nextInt();

        }

        for(int i =0; i<n; i++)
            sum += scores[i];

//        System.out.println(sum);

        double avg =(double) sum / n;
        int cnt=0;

        for(int i =0; i<n; i++){
            if(scores[i]>avg)
                cnt++;
        }
        double answer;

        answer = (double)cnt/n * 100;
        System.out.printf("%.3f" , answer);



    }
}