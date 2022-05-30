package DataStructures.BinaryIntTree;

public class IntTreeNode {
    public int data; // data stored in this node
    public IntTreeNode left; // reference to left subtree
    public IntTreeNode right; // reference to right subtree
    //<constructors>

    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
