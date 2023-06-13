package com.amogus.leetcode.binary.tree.task;

import java.util.List;

public interface BinaryTreeInorderTraversal {
    List<Integer> inorderTraversal(TreeNode root);

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
