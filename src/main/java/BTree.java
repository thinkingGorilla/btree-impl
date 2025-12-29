public class BTree {
    private BTreeNode root;

    public BTree() {
        this.root = null;
    }

    public void insert(int key) {
        if (root == null) {
            root = new BTreeNode(false);
            root.keys[0] = key;
            root.numKeys = 1;
        } else {
            if (root.isFull()) {

            } else {
                insertNonFull(root, key);
            }
        }
    }

    private void splitChild(BTreeNode parent, int index) {

    }

    private void insertNonFull(BTreeNode node, int key) {
        int currentIndex = node.numKeys - 1;

        if (node.isLeaf) {

        } else {

        }
    }

    public static void main(String[] args) {
        BTree bTree = new BTree();

        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(12);
        bTree.insert(30);

        System.out.print("In-order traversal of the B-tree: ");
        bTree.traverse();
    }
}
