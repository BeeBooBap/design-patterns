package DataStructures.BinaryIntTree;

public class IntTree {
    private IntTreeNode overallRoot;
    private String s = "";
    // <methods>

    private void preOrder(IntTreeNode node) {
        if (node == null) {
            return;
        }
        s += node.data  + ", ";

        if (node.left == null && node.right == null) {
            s += "empty";
            return;
        }

        s += "(";
        preOrder(node.left);
        s += "), ";

        if (node.right != null){
            s += "(";
            preOrder(node.right);
            s += ")";
        }
    }

    @Override
    public String toString(){
        if (overallRoot == null){
            return "empty";
        }
        preOrder(overallRoot);
        return "(" + s + ")";
    }

    public static void main(String[] args) {
        IntTree tree = new IntTree();

        IntTreeNode node3 = new IntTreeNode(0, null, null);
        IntTreeNode node4 = new IntTreeNode(8, node3, null);
        IntTreeNode node9 = new IntTreeNode(4, null, null);
        IntTreeNode node7 = new IntTreeNode(7, node9, null);
        IntTreeNode node10 = new IntTreeNode(9, null, null);
        IntTreeNode node8 = new IntTreeNode(6, null, node10);
        IntTreeNode node6 = new IntTreeNode(1, node7, node8);
        tree.overallRoot = new IntTreeNode(2, node4, node6);

        System.out.println(new IntTree());
        System.out.println(tree);

        IntTree tree1 = new IntTree();
        IntTreeNode node11 = new IntTreeNode(8, null, null);
        IntTreeNode node12 = new IntTreeNode(1, null, null);
        tree1.overallRoot = new IntTreeNode(2, node11, node12);

        System.out.println(tree1);

    }
}

