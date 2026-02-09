public class BTreeNode {

    int [] keys;
    BTreeNode [] children;
    int keysCount;
    boolean isLeaf;

    public BTreeNode(int minDegree, boolean isLeaf) {
        // 최소 차수 기준으로 최대 키와 최대 자식 수를 결정한다.
        this.keys = new int[2 * minDegree - 1];
        this.children = new BTreeNode[2 * minDegree];
        // 키의 물리적인 배열 크기와 상관 없이, 유효한 데이터가 들어있는 경계선 인덱스 표시
        this.keysCount = 0;
        this.isLeaf = isLeaf;
    }
}
