package com.prog.lafore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Chp8_BinarySearchTree_Test {
	
	Chp8_BinarySearchTree bst = new Chp8_BinarySearchTree();

	@Before
	public void setupBST(){
		bst.insertNode(50);
		bst.insertNode(25);
		bst.insertNode(75);
		bst.insertNode(12);
		bst.insertNode(37);
		bst.insertNode(43);
		bst.insertNode(30);
		bst.insertNode(33);
		bst.insertNode(87);
		bst.insertNode(93);
		bst.insertNode(97);
	}
	
	@Test
	public void test_displayTree(){
		bst.displayTree();
	}
	
	@Test
	public void test_inorder(){
		System.out.println("Inorder traversal ----");
		bst.inorderTraversal(bst.root);
		System.out.println();
	}
	
	@Test
	public void test_findNode(){
		try {
			Node result = bst.findNode(75);
			assertEquals(75, result.data);
		} catch (NodeNotFoundException e) {
			fail("test failed " + e);
		}
	}
	
	@Test
	public void test_findNonExistentNode(){
		try {
			bst.findNode(66);
			fail("test failed : expected NodeNotFoundException");
		} catch (NodeNotFoundException e) {
			
		}
	}
	
	@Test
	public void test_findMinimumNode(){
		Node node = bst.findMinimumNode();
		assertEquals(12, node.data);
	}
	
	@Test
	public void test_delete(){
		bst.deleteNode(37);
		try {
			bst.findNode(37);
			fail("test failed : expected NodeNotFoundException");
		} catch (NodeNotFoundException e) {
			
		}
		System.out.println("tree after deleting 37 ---");
		bst.displayTree();
	}
	
	@Test
	public void test_height(){
		assertEquals(4, bst.findTreeHeight(bst.root));
	}
	
	
}
