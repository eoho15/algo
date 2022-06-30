package algori.algoRecursive;

public class Fibo {

    public int DFS(int f){
        if(f ==1) return 1;
        else if(f==2) return 1;
        else return DFS(f-2)+DFS(f-1);
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        int n = 7;
        for(int i=1;i<=n;i++)
            System.out.print(fibo.DFS(i) + " ");

    }
}
