package algolecture;

public class Main56 {
    static int [] fibo;
    public int DFS(int n) {

        if (fibo[n] > 0)
            return fibo[n];
            if (n == 1)
                return fibo[n] = 1;
            else if (n == 2)
                return fibo[n] = 1;
            else
                return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }
    public static void main(String[] args) {
        Main56 T = new Main56();
        int n = 45;
        // n+1 을 하는 이유는 첫번째 index에 배열의 첫번째가 오도록 하기 위해 설정을 했기 때문이다!
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=0;i<=n;i++)
            System.out.print(fibo[i] + " ");
    }

}
