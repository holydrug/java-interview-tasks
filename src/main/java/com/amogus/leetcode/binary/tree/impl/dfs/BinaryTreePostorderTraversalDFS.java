package com.amogus.leetcode.binary.tree.impl.dfs;

import com.amogus.leetcode.binary.tree.task.BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * ==
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * ==
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/08/28/pre1.jpg
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 * ==
 * Example 2:
 * Input: root = []
 * Output: []
 * ==
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class BinaryTreePostorderTraversalDFS implements BinaryTreePostorderTraversal {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            helper(root.right, result);
            result.add(root.val);
        }
    }
}
