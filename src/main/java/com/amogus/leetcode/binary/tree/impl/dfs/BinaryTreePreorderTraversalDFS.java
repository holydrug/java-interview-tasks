package com.amogus.leetcode.binary.tree.impl.dfs;

import com.amogus.leetcode.binary.tree.impl.dfs.dto.TreeNode;
import com.amogus.leetcode.binary.tree.task.BinaryTreePreorderTraversal;


import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * ==
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * ==
 * Example 1:
 * https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 * ==
 * Example 2:
 * Input: root = []
 * Output: []
 * ==
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class BinaryTreePreorderTraversalDFS implements BinaryTreePreorderTraversal {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
}
