package Nodes.tree_binary_tree;

public class BinaryTree {
    public static void main(String[] args) {

        // 정점의 갯수
        int count = 7;

        // 크기8, index의 시작은 0부터 이기 때문에, 1부터 사용함.
        Node[] nodeList = new Node[count +1];
        // Node형식의 배열을 만듬.

        for(int i=1;i<=count;i++){
            Node binaryTree = new Node(i);
            nodeList[i] = binaryTree;
            // 노트 형식의 binaryTree를 만들고, 배열에 저장함.
        }

        for(int i=1; i<=count; i++){
            if(i *2 <= count) {
                nodeList[i].leftChild = nodeList[i*2];
                nodeList[i].rightChild = nodeList[(i*2)+1];
            }
        }

        preOrder(nodeList[1]);
        System.out.println();
        inOrder(nodeList[1]);
        System.out.println();
        postOrder(nodeList[1]);
    }

    static void preOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }

    static void inOrder(Node node){
        if(node != null){
            inOrder(node.leftChild);
            System.out.print(node.data+ " ");
            inOrder(node.rightChild);
        }
    }

    static void postOrder(Node node){
        if(node != null){
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(node.data + " ");
        }
    }

}
