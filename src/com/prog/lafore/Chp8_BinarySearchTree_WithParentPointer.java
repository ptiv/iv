package com.prog.lafore;

import java.util.Stack;

/**
 * Binary Search Tree from Lafore with a pointer to the parent node
 * 
 * @author ptemkar
 * @date 08/15/13
 */
public class Chp8_BinarySearchTree_WithParentPointer {
	Node_withParent root;

	public Node_withParent findNode(int key) throws NodeNotFoundException{
		Node_withParent current = root;
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

		Node_withParent node = new Node_withParent(key);
		if(root == null){
			root = node;
			return;
		}

		Node_withParent current = root;

		while(current != null){
			if(key >= current.data){
				if(current.rightChild == null){ 				
					current.rightChild = node;
					node.parent = current;
					return;
				}else{
					current = current.rightChild;
				}
			}else{
				if(current.leftChild == null){
					current.leftChild = node;
					node.parent = current;
					return;
				}else{
					current = current.leftChild;
				}
			}
		}
	}

	// start with the root node
	public void inorderTraversal(Node_withParent node){
		if(node.leftChild != null){
			inorderTraversal(node.leftChild);
		}
		node.displayNode();
		if(node.rightChild != null){
			inorderTraversal(node.rightChild);
		}

	}

	public Node_withParent findMinimumNode(){
		Node_withParent current = root;
		while(current.leftChild != null){
			current = current.leftChild;
		}
		return current;
	}

	public Node_withParent findMaximumNode(){
		Node_withParent current = root;
		while(current.rightChild != null){
			current = current.rightChild;
		}
		return current;
	}

	public boolean deleteNode(int key){

		Node_withParent current = root;
		Node_withParent parent = root;
		boolean isLeftChild = false;

		//This part will find the node to be deleted
		//It will be stored in current.
		//parent will point to the parent node
		while(current.data != key){

			//if you don't wanna use node.parent
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
			//if the left sub-tree is not null and the right one is null
			if(current == root){
				root = current.leftChild;
			}else{
				if(isLeftChild){
					parent.leftChild = current.leftChild;
					current.leftChild.parent = parent;
				}else{
					parent.rightChild = current.leftChild;
					current.leftChild.parent = parent;
				}
			}

		}else if(current.leftChild == null){
			//if the right sub-tree is not null

			if(current == root){
				root = current.rightChild;
			}else{
				if(isLeftChild){
					parent.leftChild = current.rightChild;
					current.rightChild.parent = parent;
				}else{
					parent.rightChild = current.rightChild;
					current.rightChild.parent = parent;
				}
			}	

		}else{
			//the node to be deleted has both sub-trees
			Node_withParent successor = getSuccessor(current);

			if(current == root){
				root = successor;
			}else if(isLeftChild){
				parent.leftChild = successor;
			}else{
				parent.rightChild = successor;
			}
			
			successor.parent = parent;
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
	public Node_withParent getSuccessor(Node_withParent delNode){
		Node_withParent successor = null;

		Node_withParent delNodeRightChild = delNode.rightChild;

		if(delNodeRightChild.leftChild == null){
			successor = delNodeRightChild;
		}else{
			//find the left-most node of the right sub-tree of delNode
			Node_withParent parent = delNode;
			Node_withParent current = delNode;

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
				Node_withParent temp = (Node_withParent)globalStack.pop();
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

class Node_withParent{
	
	int data;
	Node_withParent leftChild;
	Node_withParent rightChild;
	Node_withParent parent;

	public Node_withParent(int data){
		this.data = data;
	}

	public void displayNode(){
		System.out.print(data + " ");
	}
}
