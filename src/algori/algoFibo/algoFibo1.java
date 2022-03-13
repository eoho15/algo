package algori.algoFibo;

public class algoFibo1 {
    public static void main(String[] args) {

        // F1 =  F2 = 1
        // Fn = F(n-1) + F(n-2)
        System.out.println(fibonacci(10));
        // 1. 재귀적 호출
        // 2. 동적계획법
        // 3. 반복문

    }
    public static int fibonacci(int n) {
        if(n == 0 || n ==1 ) {
            return 1;
        }else return fibonacci(n-1)+ fibonacci(n-2); //이미 중복했던 내용이 너무 오래 걸린다


    }
}
