public class BTree {
    private BTreeNode root;

    public BTree() {
        this.root = null;
    }

    public void insert(int key) {
        if (root == null) {
            root = new BTreeNode(true);
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
            // 정렬된 순서를 지키기 위해, 삽입할 값보다 큰 key를 오른쪽으로 한 칸씩 이동
            while(currentIndex >= 0 && node.keys[currentIndex] > key) {
                node.keys[currentIndex + 1] = node.keys[currentIndex];
                currentIndex--;
            }

            node.keys[++currentIndex] = key;
            node.numKeys++;
        } else {

        }
    }

    public static void main(String[] args) {
        BTree bTree = new BTree();

        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);


        System.out.print("In-order traversal of the B-tree: ");
        // bTree.traverse();
    }
}
