/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/3 22:37
 */
public class  BTreeNode{
    int T;		//表示每个节点最少的值个数
    int count;	//节点值个数
    int key[];	//关键字个数
    BTreeNode childs[];	//指针个数
    Boolean isleaf;	//叶子节点

    public BTreeNode(int T) {
        this.T = T;
        key = new int[2 * T - 1];
        childs = new BTreeNode[2 * T];
        isleaf = true;
        count = 0;
    }
}


