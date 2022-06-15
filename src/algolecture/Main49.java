package algolecture;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[][] arr = new int[cnt][2];
        for(int i=0;i<cnt;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else {
                    return o1[0] -o2[0];
                }
            }
        });

        for(int i=0;i<cnt;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
