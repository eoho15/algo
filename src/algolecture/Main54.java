package algolecture;

public class Main54{
    public void DFS(int n){
        if(n==0)
            return;
        else{
            DFS(n/2);
            System.out.print(n%2+" ");
        }
    }

    public static void main(String[] args) {
        Main54 T = new Main54();
        T.DFS(11);
    }
}
