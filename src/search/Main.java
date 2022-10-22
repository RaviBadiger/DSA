package search;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(45);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);
        System.out.println("BFS " + myBST.BFS());
        System.out.println(myBST.contains(10));
        System.out.println(" DFS PreOrder " + myBST.dFSPreOrder());
        System.out.println(" DFS PostOrder " + myBST.dFSPostOrder());
        System.out.println(" DFS InOrder " + myBST.dFSInOrder());


    }
}