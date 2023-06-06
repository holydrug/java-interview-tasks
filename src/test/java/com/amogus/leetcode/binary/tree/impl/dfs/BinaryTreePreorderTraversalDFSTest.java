package com.amogus.leetcode.binary.tree.impl.dfs;

import com.amogus.leetcode.binary.tree.impl.dfs.dto.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversalDFSTest {

    private BinaryTreePreorderTraversalDFS underTest;

    @BeforeEach
    void setUp() {
        underTest = new BinaryTreePreorderTraversalDFS();
    }

    @Test
    void preorderTraversal1() {
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Object> output = List.of(1,2,3);

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void preorderTraversal2() {
        TreeNode input = null;
        List<Object> output = List.of();

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void preorderTraversal3() {
        TreeNode input = new TreeNode(1, null, null);
        List<Object> output = List.of(1);

        List<Integer> result = underTest.preorderTraversal(input);

        Assertions.assertArrayEquals(output.toArray(), result.toArray());
    }
}