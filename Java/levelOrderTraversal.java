// level order traversal
// contributor - malay jeena

package BinaryTree.Theory;

import BinaryTree.Treenode;

import java.util.*;

public class LevelOrderTrav {
    public static void main(String[] args) {
        Queue<Treenode> q = new LinkedList<>();
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
        root.right.left = new Treenode(6);
        root.right.right = new Treenode(7);
        List<Integer> res = new ArrayList<>();
        System.out.println(levelOrder(root,q,res));
    }

    private static List<Integer> levelOrder(Treenode root, Queue<Treenode> q, List<Integer> res) {
        if (root == null) {
            return res;
        }
        q.add(root);
        while (!q.isEmpty()) {
            Treenode node = q.poll();
            res.add(node.val);
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return res;
    }
}

