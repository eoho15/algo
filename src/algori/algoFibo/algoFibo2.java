package algori.algoFibo;

public class algoFibo2 {
    // static의 배열을 만들었음
    static long[] fibo;
    final static int idx = 50;

    public static void main(String[] args) {
        fibo = new long[idx+1];
        System.out.println(fibonacci(idx));
    }

    public static long fibonacci(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // 1,1,2,
        if(fibo[n] != 0) {
            return fibo[n];
        }
        fibo[n] = fibonacci(n-1) + fibonacci(n-2);
        return fibo[n];
    }
}
