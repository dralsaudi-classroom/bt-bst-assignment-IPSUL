package com.example.project;

public class TreeUser {

    public static <T> int countLeavesHelper(BTNode<T> node){
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return 1;
		}

		return countLeavesHelper(node.left) + countLeavesHelper(node.right);
    }

    public static <T> int countLeaves(BT<T> bt) {
        //throw new UnsupportedOperationException("Not supported yet.");
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
        BTNode<T> root = bt.root;
        return countLeavesHelper(root);
    }
}
