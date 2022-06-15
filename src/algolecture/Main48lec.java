package algolecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main48lec {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        // 깊은복사를 해야한다!
        // 얕은 복사를 하면 안된다!
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main48lec T = new Main48lec();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = kb.nextInt();
        for(int x : T.solution(n,arr))
            System.out.print(x + " ");
    }
}
