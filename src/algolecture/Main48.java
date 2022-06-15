package algolecture;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        int[] arr2 = new int[input];
        String answer ="";
        // 배열 입력받아 저장하는 코드
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i])
                answer += i+1+" ";
        }
        System.out.println(answer);
    }
}

