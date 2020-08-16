package bst;

/**
 * Created by Deb
 * Date : 16/08/2020
 */
public class Start {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] data = new int[]{20, 16, 10, 17, 35, 48};
        Node root = tree.build(data, data.length);
        System.out.println("Pre order traversal of the constructed tree is ");
        tree.print(root);
    }
}
