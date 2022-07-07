package dfs_bfs;
import java.util.Scanner;

public class Main5 {
    static int n,m,answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n){
            answer++;
        }
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                   ch[i] = 1;
                   DFS(i);
                   ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        // 이 그래프르 왜 만들었을까?..?
        graph = new int[n+1][n+1];
        // 체크배열을 하기위해 만듬..
        ch = new int[n+1];
        for(int i=0;i<m;i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}
