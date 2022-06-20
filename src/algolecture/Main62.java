package algolecture;

import java.util.LinkedList;
import java.util.Queue;

class Nodes{
    int data;
    Nodes lt,rt;
    public Nodes(int val){
        data = val;
        lt= rt=null;
    }
}

public class Main62 {
    Nodes root;

    public int BFS(Nodes root){
        Queue<Nodes> Q = new LinkedList<>();

        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0;i<len;i++){
                Nodes cur = Q.poll();
                if(cur.lt == null && cur.rt == null)
                    return L;
                if(cur.lt!=null)
                    Q.offer(cur.lt);
                if(cur.rt!=null)
                    Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {

        Main62 tree = new Main62();
        tree.root = new Nodes(1);
        tree.root.lt = new Nodes(2);
        tree.root.rt = new Nodes(3);
        tree.root.lt.lt = new Nodes(4);
        tree.root.lt.rt = new Nodes(5);
        System.out.println(tree.BFS(tree.root));

    }
}
