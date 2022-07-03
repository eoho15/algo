package algolecture;
import java.util.LinkedList;
import java.util.Queue;


class Node3 {
    int data;
    Node3 lt,rt;
    public Node3(int val){
        data = val;
        lt= rt= null;
    }
}

public class Main68_BFS {
    Node3 root;
    public int BFS(Node3 root){
        Queue<Node3> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node3 cur = Q.poll();
                if (cur.lt == null && cur.rt == null)
                    return L;
                if (cur.lt != null)
                        Q.offer(cur.lt);
                if (cur.rt != null)
                        Q.offer(cur.rt);
                }
                L++;
            }
        return 0;
    }

    public static void main(String[] args) {
        Main68_BFS tree = new Main68_BFS();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.BFS(tree.root));
    }
}
