public class BTreeNode {

    private static final int MAX_DEGREE = 4;

    public int numKeys;
    public int[] keys;
    public BTreeNode[] children;
    public boolean isLeaf;

    public BTreeNode(boolean isLeaf) {
        this.numKeys = 0;
        this.keys = new int[MAX_DEGREE - 1];
        this.children = new BTreeNode[MAX_DEGREE];
        this.isLeaf = isLeaf;
    }

    public boolean isFull() {
        return numKeys == MAX_DEGREE - 1;
    }
}
