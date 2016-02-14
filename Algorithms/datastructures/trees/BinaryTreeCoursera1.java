package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCoursera1<E> {
	
	TreeNode<E> root;
	
	BinaryTreeCoursera1(){
		
	}
	
	
	private void levelOrder(){
		
		Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode<E> currentNode = queue.remove();
			if(currentNode != null){
				currentNode.visit();
				queue.add(currentNode.left); //can add null check
				queue.add(currentNode.right);
			}
		}
	}
	private void preOrder(TreeNode<E> c){
		if(c != null){
			c.visit();
			preOrder(c.left);
			preOrder(c.right);
			
		}
	}
	
	class TreeNode<S> {
		private S value;
		private TreeNode<S> parent;
		private TreeNode<S> left;
		private TreeNode<S> right;
		
		TreeNode(S value,TreeNode<S> parent){
			this.value = value;
			this.parent = parent;
			this.left = null;
			this.right = null;
		}
		
		public TreeNode<S> addLeftChild(S value){
			this.left = new TreeNode<S>(value, this);
			return this.left;
		}
		
		public void visit(){
			System.out.println(this.value);
		}
	}
}
