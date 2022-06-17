package algolecture;

public class Main55 {

    public int DFS(int n){
        if(n==1)
            return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        Main55 T = new Main55();
        System.out.println(T.DFS(5));


    }
}
