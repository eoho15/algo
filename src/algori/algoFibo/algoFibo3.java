package algori.algoFibo;

public class algoFibo3 {

    static long[] fibo;
    final static int idx = 200;

    public static void main(String[] args) {
        //배열 초기화
        fibo = new long[idx+1];
        System.out.println(fibonacci(idx));
    }

    public static long fibonacci(int n){

        fibo[0] = 1;
        fibo[1] = 1;

        for(int i=2; i<=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[n];
    }
}
