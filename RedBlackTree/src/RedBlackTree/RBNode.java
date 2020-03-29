package RedBlackTree;

/**
 * @author atom.hu
 * @version V1.0
 * @Package RedBlackTree
 * @date 2020/3/29 18:06
 */
public class RBNode {
    private final boolean RED = false;
    private final boolean BLACK = true;
    private int key;
    private boolean color;
    private RBNode left;
    private RBNode right;
    private RBNode parent;
    public RBNode(int key) {
        this.key = key;
        this.color = RED;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public boolean getColor() {
        return color;
    }
    public void setColor(boolean color) {
        this.color = color;
    }
    public RBNode getLeft() {
        return left;
    }
    public void setLeft(RBNode left) {
        this.left = left;
    }
    public RBNode getRight() {
        return right;
    }
    public void setRight(RBNode right) {
        this.right = right;
    }
    public RBNode getParent() {
        return parent;
    }
    public void setParent(RBNode parent) {
        this.parent = parent;
    }
    @Override
    public String toString() {
        return "RBTreeNode{" +
                ",key=" + key +
                ", color=" + color +
                '}';
    }
}
