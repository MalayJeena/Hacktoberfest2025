// is balanced binary tree
// contributor - malay jeena

package BinaryTree.Medium;

import BinaryTree.Treenode;

public class isBalancedTree {
    public static void main(String[] args) {
        Treenode root = new Treenode(3);
//        root.left = new Treenode(9);
        root.right = new Treenode(20);
        root.right.left = new Treenode(15);
//        root.right.right = new Treenode(7);
//        root.right.right.left = new Treenode(15);

        // 2nd tree
//        root.left = new Treenode(5);
//        root.left.right = new Treenode(7);
        System.out.println(solve1(root));
    }

    private static boolean solve1(Treenode root) {
        if (root == null) {
            return true;
        }

        int heightLeft = maxHeight(root.left);
        int heightRight = maxHeight(root.right);

        boolean leftSubTree = solve1(root.left);
        boolean rightSubTree = solve1(root.right);

        return Math.abs(heightLeft - heightRight) <= 1 && leftSubTree && rightSubTree;

    }

    private static int maxHeight(Treenode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 1 + maxHeight(root.left);
        int rightHeight = 1 + maxHeight(root.right);
        return Math.max(leftHeight, rightHeight);
    }
}
