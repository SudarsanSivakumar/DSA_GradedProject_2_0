package question2;



public class Driver {
    public static void main(String[] args) {

        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        // Order of the Skewed tree can
        // be defined as follows -
        // For Increasing order - 0
        // For Decreasing order - 1
        int order = 0;
        Main.BSToSkewed(tree.node);
        Main.traverseRightSkewed(Main.headNode);
    }
}
