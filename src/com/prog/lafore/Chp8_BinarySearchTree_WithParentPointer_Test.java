package com.prog.lafore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class Chp8_BinarySearchTree_WithParentPointer_Test {
	Chp8_BinarySearchTree_WithParentPointer bst = new Chp8_BinarySearchTree_WithParentPointer();

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
			Node_withParent result = bst.findNode(75);
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
		Node_withParent node = bst.findMinimumNode();
		assertEquals(12, node.data);
	}
	
	@Test
	public void test_parentNode(){
		try {
			Node_withParent result = bst.findNode(43);
			assertEquals(37, result.parent.data);
		} catch (NodeNotFoundException e) {
			fail("node 43 not found");
		}
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
		
		//parent changed after deletion
		try {
			Node_withParent result = bst.findNode(43);
			assertEquals(25, result.parent.data);
		} catch (NodeNotFoundException e) {
			fail("node 43 not found");
		}
		
	}
}
