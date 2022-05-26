package algolecture;
import java.util.Scanner;

public class Main29math {
    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n= n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main29math T = new Main29math();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
