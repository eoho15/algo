package algolecture;
import java.util.Scanner;

public class Main67{
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    // ps = 프라블럼 스코어
    // pt = 프라블럼
    public void DFS(int L, int sum, int time, int[] ps, int[] pt){
        // 부분집합 구하는 코드..
        if(time>m)
            return;

        if(L == n){
            answer = Math.max(answer, sum);
        }
        else{
            DFS(L+1,  sum+ps[L] , time+pt[L], ps,pt);
            DFS(L+1, sum,time,ps,pt);
        }
    }

    public static void main(String[] args) {
        Main67 T = new Main67();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        // 점수
        int[] a = new int[n];
        //제한시간
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
