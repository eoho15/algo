package algolecture;
import java.util.Arrays;
import java.util.Scanner;

public class Main51 {
    public int count(int[] arr, int capacity){
        int cnt=1, sum =0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+= x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        // 간단하게 최대값을 구해주는것.
        // stream클래스에 있는 메소드 max
        // 큰 데이터에서 최댓값을 찾을 때 stream을 사용하자!
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid -1;
            }
            else
                lt = mid+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main51 T = new Main51();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = kb.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
