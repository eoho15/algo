package algolecture;

public class Main53 {
    public void DFS(int n){
        if(n == 0)
            // void 형에서 return; 하면 종료의 의미도 가지고 있다.
            // 재귀함수는 stack Frame을 사용한다.
            return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Main53 T = new Main53();
        T.DFS(3);
    }
}
