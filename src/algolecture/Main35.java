package algolecture;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main35 {
    public int solution(int[] arr, int n, int k) {
        //TreeSet 중복을 제거하고 정렬한다.
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                for(int l = j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt ==k)
                return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main35 T = new Main35();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr,n,k));
    }
}
