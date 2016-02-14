package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BasicTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		
		/*BinaryTree.Node node1 = bt.new Node(45);
		BinaryTree.Node node2 = bt.new Node(66);
		BinaryTree.Node node3 = bt.new Node(12);
		BinaryTree.Node node4 = bt.new Node(89);
		BinaryTree.Node node5 = bt.new Node(4);
		BinaryTree.Node node6 = bt.new Node(57);*/
		
		/*BinaryTree.Node node1 = bt.new Node(50);
		BinaryTree.Node node2 = bt.new Node(25);
		BinaryTree.Node node3 = bt.new Node(15);
		BinaryTree.Node node4 = bt.new Node(30);
		BinaryTree.Node node5 = bt.new Node(75);
		BinaryTree.Node node6 = bt.new Node(85);*/
		
		BinaryTree.Node node1 = bt.new Node(50);
		BinaryTree.Node node2 = bt.new Node(25);
		BinaryTree.Node node3 = bt.new Node(15);
		BinaryTree.Node node4 = bt.new Node(30);
		BinaryTree.Node node5 = bt.new Node(75);
		BinaryTree.Node node6 = bt.new Node(85);
		BinaryTree.Node node7 = bt.new Node(2);
		BinaryTree.Node node8 = bt.new Node(18);
		
		/*BinaryTree.Node node1 = bt.new Node(7);
		BinaryTree.Node node2 = bt.new Node(1);
		BinaryTree.Node node3 = bt.new Node(9);
		BinaryTree.Node node4 = bt.new Node(0);
		BinaryTree.Node node5 = bt.new Node(3);
		BinaryTree.Node node6 = bt.new Node(2);
		BinaryTree.Node node7 = bt.new Node(5);
		BinaryTree.Node node8 = bt.new Node(4);
		BinaryTree.Node node9 = bt.new Node(6);
		BinaryTree.Node node10 = bt.new Node(8);
		BinaryTree.Node node0 = bt.new Node(10);*/
		
		
		System.out.println("Forming Binay tree");
		bt.addNode(node1);
		bt.addNode(node2);
		bt.addNode(node3);
		bt.addNode(node4);
		bt.addNode(node5);
		bt.addNode(node6);
		bt.addNode(node7);
		bt.addNode(node8);
		
		/*bt.addNode(node7);
		bt.addNode(node8);
		bt.addNode(node9);
		bt.addNode(node10);
		bt.addNode(node0);*/
		
		System.out.println("Completed Binay tree");
		System.out.println("Level order traversal of Binay tree -- start");
		bt.levelOrderTraversal(node1);
		System.out.println("Level order traversal of Binay tree--end");
		
		bt.removeNode(18);
		
		System.out.println("Inorder traversal of Binay tree -- start");
		bt.inOrderTraversal(node1);
		System.out.println();
		System.out.println("Inorder traversal of Binay tree--end");
		
		System.out.println("preorder traversal of Binay tree -- start");
		bt.preOrderTraversal(node1);
		System.out.println();
		System.out.println("preorder traversal of Binay tree--end");
		
		System.out.println("postorder traversal of Binay tree -- start");
		bt.postOrderTraversal(node1);
		System.out.println();
		System.out.println("prostorder traversal of Binay tree--end");
		
		System.out.println("Find Node :"+bt.findNode(8));
		
	}
}

class BinaryTree {
	
	private Node root;
	private Node focusNode,parentNode;
	
	
	public boolean removeNode(int value){
		
		focusNode = root;
		while(focusNode != null){
			if(focusNode.value == value) {
				if (null != focusNode.rightChild)
					focusNode.rightChild.leftChild = focusNode.leftChild;
				if(focusNode == root){
					root = focusNode.rightChild;
				}
				else {
					if(parentNode.value >  focusNode.value){
						parentNode.leftChild = focusNode.rightChild;
					}
					else
						parentNode.rightChild = focusNode.rightChild;
				}
				focusNode.leftChild = null;
				focusNode.rightChild = null;
				return true;
			}
			else if(value > focusNode.value){
				parentNode = focusNode;
				focusNode = focusNode.rightChild;
			}
			else {
				parentNode = focusNode;
				focusNode = focusNode.leftChild;
			}
		}
		
		return false;
	}
	
	public Node findNode(int value){
		
		focusNode = root;
		
		while(focusNode != null) {
			if(focusNode.value == value) {
				return focusNode;
			}
			else if(value > focusNode.value){
				focusNode = focusNode.rightChild;
			}
			else {
				focusNode = focusNode.leftChild;
			}
		}
		
		return null;
	}
	
	public void levelOrderTraversal(Node startNode){
		Queue<Node> ll = new LinkedList<Node>();
		ll.add(startNode);
		
		while(!ll.isEmpty()){
			Node currentNode = ll.remove();
			System.out.print(currentNode.value+" ,");
			if(null != currentNode){
				if(null != currentNode.leftChild)
					ll.add(currentNode.leftChild);
				if(null != currentNode.rightChild)
					ll.add(currentNode.rightChild);
			}
		}
	}
	
	public void postOrderTraversal(Node startNode){
		if(startNode != null){
			postOrderTraversal(startNode.leftChild);
			postOrderTraversal(startNode.rightChild);
			System.out.print(startNode.value+", ");
		}
		
	}
	
	//Preorder traversal: To traverse a binary tree in Preorder, following operations are carried-out (i) Visit the root, (ii) Traverse the left subtree, and (iii) Traverse the right subtree.
	//Therefore, the Preorder traversal of the above tree will outputs:
	//7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10
	
	public void preOrderTraversal(Node startNode){
		if(startNode != null){
			System.out.print(startNode.value+", ");
			preOrderTraversal(startNode.leftChild);
			preOrderTraversal(startNode.rightChild);
		}
		
	}
	
	//Inorder traversal: To traverse a binary tree in Inorder, following operations are carried-out (i) Traverse the left most subtree starting at the left external node, (ii) Visit the root, and (iii) Traverse the right subtree starting at the left external node.
	//Therefore, the Inorder traversal of the above tree will outputs:
	//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	public void inOrderTraversal(Node startNode){
		if(startNode != null){
			inOrderTraversal(startNode.leftChild);
			System.out.print(startNode.value+", ");
			inOrderTraversal(startNode.rightChild);
		}
	}
	
	public void addNode(Node inNode){
		if(root == null){
			root = inNode;
		}
		else {
			focusNode = root;
			while(true) {
				if (inNode.value < focusNode.value){
					if(focusNode.leftChild == null){
						focusNode.leftChild = inNode;
						return;
					}
					else {
						focusNode = focusNode.leftChild;
					}
				}
				else {
					if(focusNode.rightChild == null){
						focusNode.rightChild = inNode;
						return;
					}
					else {
						focusNode = focusNode.rightChild;
					}
				}
			}
		}
		
	}
	
	class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;
		
		Node(int value){
			this.value = value;
		}
		
		public String toString(){
			return value+"";
		}
	}
}