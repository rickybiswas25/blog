package bst;

/**
 * Created by Deb
 * Date : 16/08/2020
 */
/*Construct binary tree from pre order traversal*/
public class BinaryTree {
    DataIndex index;

    public BinaryTree() {
        index = new DataIndex();
    }

    public Node build(int[] data, int length) {
        return build(data, this.index, 0, length - 1, length);
    }

    Node build(int[] data, DataIndex dataIndex, int low, int high, int size) {
        if (dataIndex.getIndex() >= size || low > high) {
            return null;
        }

        Node root = new Node(data[dataIndex.getIndex()]);
        dataIndex.setIndex(dataIndex.getIndex() + 1);

        if (low == high) {
            return root;
        }

        int i;
        for (i = low; i <= high; ++i) {
            if (data[i] > root.data) {
                break;
            }
        }

        root.left = build(data, dataIndex, dataIndex.getIndex(), i - 1, size);
        root.right = build(data, dataIndex, i, high, size);

        return root;
    }

    public void print(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        print(node.left);
        print(node.right);
    }
}
