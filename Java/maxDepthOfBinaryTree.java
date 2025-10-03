// max depth of a binary tree
// contributor - malay jeena
package BinaryTree.Medium;

import BinaryTree.Treenode;

public class MaxDepthBT {
    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.left.left = new Treenode(5);
        root.left.right = new Treenode(6);
        System.out.println(solve1(root));
    }

    public static int solve1(Treenode root) {
        if (root == null) return 0;

        int l = 1 + solve1(root.left);
        int r = 1 + solve1(root.right);

        return Math.max(l, r);
    }
}
