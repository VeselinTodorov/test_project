package com.veso.test.testapp.playground.binary_tree;

/**
 * Created by Veso on 9.10.2017 г..
 */

public class BinaryTree {

	Node root;

	private class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public BinaryTree() {
	}

	public void add(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		}

		insertNode(root, value);
	}

	private void insertNode(Node target, int value) {
		if (value <= target.value) {
			if (target.left == null) {
				target.left = new Node(value);
				System.out.println("Inserting " + value + " to left of " + target.value);
			} else {
				insertNode(target.left, value);
			}
		} else if (target.right == null) { // value > target.value
			target.right = new Node(value);
			System.out.println("Inserting " + value + " to right of " + target.value);
		} else {
			insertNode(target.right, value);
		}
	}

	public int min() {
		if (root == null) {
			return 0;
		}
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}

		return current.value;
	}

	public int max() {
		if (root == null) {
			return 0;
		}
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}

		return current.value;
	}

	public int sum() {
		if (root == null) {
			return 0;
		}

		return sumSubtree(root);
	}

	private int sumSubtree(Node target) {
		return target.value + (target.left != null ? sumSubtree(target.left) : 0) + (target.right != null ? sumSubtree(target.right) : 0);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.add(50);
		tree.add(35);
		tree.add(7);
		tree.add(81);
		tree.add(92);
		tree.add(42);
		tree.add(67);
		tree.add(23);
		tree.add(35);

		System.out.println("MIN is " + tree.min());
		System.out.println("MAX is " + tree.max());
		System.out.println("SUM is " + tree.sum());
	}
}
