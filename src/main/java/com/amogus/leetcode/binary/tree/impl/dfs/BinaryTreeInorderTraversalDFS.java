package com.amogus.leetcode.binary.tree.impl.dfs;

import com.amogus.leetcode.binary.tree.task.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * ==
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * ==
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * ==
 * Example 2:
 * Input: root = []
 * Output: []
 * ==
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class BinaryTreeInorderTraversalDFS implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);

        return list;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
}
