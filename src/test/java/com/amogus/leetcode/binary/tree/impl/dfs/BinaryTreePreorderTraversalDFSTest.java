package com.amogus.leetcode.binary.tree.impl.dfs;

import com.amogus.leetcode.binary.tree.task.BinaryTreePreorderTraversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreePreorderTraversalDFSTest {

    private BinaryTreePreorderTraversalDFS underTest;

    @BeforeEach
    void setUp() {
        underTest = new BinaryTreePreorderTraversalDFS();
    }

    @Test
    void preorderTraversal1() {
        BinaryTreePreorderTraversal.TreeNode input = new BinaryTreePreorderTraversal.TreeNode(1, null, new BinaryTreePreorderTraversal.TreeNode(2, new BinaryTreePreorderTraversal.TreeNode(3, null, null), null));
        List<Object> output = List.of(1, 2, 3);

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void preorderTraversal2() {
        BinaryTreePreorderTraversal.TreeNode input = null;
        List<Object> output = List.of();

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void preorderTraversal3() {
        BinaryTreePreorderTraversal.TreeNode input = new BinaryTreePreorderTraversal.TreeNode(1, null, null);
        List<Object> output = List.of(1);

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }
}