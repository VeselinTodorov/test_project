package com.veso.test.testapp;

import com.veso.test.testapp.playground.binary_tree.BinaryTree;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Veso on 9.10.2017 г..
 */

public class BinaryTreeTest {


	@Test
	public void treeMaxValueTest() {
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

		Assert.assertEquals(92, tree.max());
	}

	@Test
	public void treeMinValueTest() {
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

		Assert.assertEquals(7, tree.min());
	}

	@Test
	public void treeSumTest() {
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

		Assert.assertEquals(432, tree.sum());
	}
}
