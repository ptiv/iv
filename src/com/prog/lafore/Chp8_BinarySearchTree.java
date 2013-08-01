package com.prog.lafore;

import java.util.Stack;

/**
 * 
 * Binary Search Tree from Lafore
 * 
 * @author ptemkar
 * @date 07/28/13
 */
public class Chp8_BinarySearchTree{

	Node root;

	public Node findNode(int key) throws NodeNotFoundException{
		Node current = root;
		while(current != null){

			if(key == current.data){
				return current;
			}else if(key < current.data){
				current = current.leftChild;
			}else{
				current = current.rightChild;
			}
		}
		throw new NodeNotFoundException();
	}

	public void insertNode(int key){

		Node node = new Node(key);
		if(root == null){
			root = node;
			return;
		}

		Node current = root;

		while(current != null){
			if(key >= current.data){
				if(current.rightChild == null){ 				
					current.rightChild = node;
					return;
				}else{
					current = current.rightChild;
				}
			}else{
				if(current.leftChild == null){
					current.leftChild = node;
					return;
				}else{
					current = current.leftChild;
				}
			}
		}
	}

	// start with the root node
	public void inorderTraversal(Node node){
		if(node.leftChild != null){
			inorderTraversal(node.leftChild);
		}
		node.displayNode();
		if(node.rightChild != null){
			inorderTraversal(node.rightChild);
		}

	}

	public Node findMinimumNode(){
		Node current = root;
		while(current.leftChild != null){
			current = current.leftChild;
		}
		return current;
	}

	public Node findMaximumNode(){
		Node current = root;
		while(current.rightChild != null){
			current = current.rightChild;
		}
		return current;
	}

	public boolean deleteNode(int key){

		Node current = root;
		Node parent = root;
		boolean isLeftChild = false;

		//This part will find the node to be deleted
		//It will be stored in current.
		while(current.data != key){

			parent = current;
			if(key < current.data){	 			
				current = current.leftChild;
				isLeftChild = true;
			}else{
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null){
				//node not found
				return false;
			}
		}

		//if the node has no sub-trees
		if(current.leftChild == null && current.rightChild == null){
			if(current == root){
				//if it's the root node
				root = null;
			}else{
				//if it's a leaf node
				if(isLeftChild){
					parent.leftChild = null;
				}else{
					parent.rightChild = null;
				}
			}

		}else if(current.rightChild == null){
			//if the left sub-tree is not null
			if(current == root){
				root = current.leftChild;
			}else{
				if(isLeftChild){
					parent.leftChild = current.leftChild;
				}else{
					parent.rightChild = current.leftChild;
				}
			}

		}else if(current.leftChild == null){
			//if the right sub-tree is not null

			if(current == root){
				root = current.rightChild;
			}else{
				if(isLeftChild){
					parent.leftChild = current.rightChild;
				}else{
					parent.rightChild = current.rightChild;
				}
			}	

		}else{
			//the node to be deleted has both sub-trees
			Node successor = getSuccessor(current);

			if(current == root){
				root = successor;
			}else if(isLeftChild){
				parent.leftChild = successor;
			}else{
				parent.rightChild = successor;
			}

			successor.leftChild = current.leftChild;
		}

		return true;

	}  // --------   end of deleteNode()   -----------

	/**
	 * ------   revisit this method   ------
	 *
	 * returns the inorder successor of the node which is being deleted
	 * Also, it's parent's leftChild is set to null.
	 * @param delNode
	 * @return
	 */
	public Node getSuccessor(Node delNode){
		Node successor = null;

		Node delNodeRightChild = delNode.rightChild;

		if(delNodeRightChild.leftChild == null){
			successor = delNodeRightChild;
		}else{
			//find the left-most node of the right sub-tree of delNode
			Node parent = delNode;
			Node current = delNode;

			while(current.leftChild != null){
				parent = current;
				current = current.leftChild;
			}
			successor = current;
			parent.leftChild = null;

		}

		return successor;
	}

	/**
	 * from lafore
	 */
	public void displayTree()
	{
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(
				"......................................................");
		while(isRowEmpty==false)
		{
			Stack localStack = new Stack();
			isRowEmpty = true;

			for(int j=0; j<nBlanks; j++)
				System.out.print(' ');

			while(globalStack.isEmpty()==false)
			{
				Node temp = (Node)globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.data);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if(temp.leftChild != null ||
							temp.rightChild != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
					System.out.print(' ');
			}  // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}  // end while isRowEmpty is false
		System.out.println(
		"......................................................");
	}  // end displayTree()
}

class Node{
	int data;
	Node leftChild;
	Node rightChild;

	public Node(int data){
		this.data = data;
	}

	public void displayNode(){
		System.out.print(data + " ");
	}
}

class NodeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
