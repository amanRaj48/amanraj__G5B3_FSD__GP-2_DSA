package com.greatLearning.businessTransactions.model;

import java.util.*;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class SkewedTreeConversion {
	Node node;

	public SkewedTreeConversion() {
		this.node = null;
	}

	public Node convertToSkewedTree(Node root) {
		if (root == null) {
			return null;
		}

		List<Integer> list = new ArrayList<>();
		inorderTraversal(root, list);

		Node skewedRoot = new Node(list.get(0));
		Node current = skewedRoot;

		for (int i = 1; i < list.size(); i++) {
			Node newNode = new Node(list.get(i));
			current.right = newNode;
			current = newNode;
		}

		return skewedRoot;
	}

	public void inorderTraversal(Node root, List<Integer> list) {
		if (root == null) {
			return;
		}

		inorderTraversal(root.left, list);
		list.add(root.data);
		inorderTraversal(root.right, list);
	}

	public void printInorder(Node root) {
		if (root == null) {
			return;
		}

		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}

	public static void main(String[] args) {
		SkewedTreeConversion tree = new SkewedTreeConversion();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Node skewedRoot = tree.convertToSkewedTree(tree.node);
		tree.printInorder(skewedRoot);
	}
}