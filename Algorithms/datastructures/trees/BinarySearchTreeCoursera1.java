package datastructures.trees;

import java.util.Comparator;

public class BinarySearchTreeCoursera1<E> {

	private Node<E> root;
	
	
	public void add(E value){
		if(root == null){
			root = new Node<E>(value);
		}
		else {
			Node currentNode = root;
			while(true){
				if(true){
					currentNode = currentNode.right;
				}
				else {
					currentNode = currentNode.left;
				}
			}
		}
	}

	
	
	
	private class Node<S> {
		
		Node<S> left;
		Node<S> right;
		S value;
		
		Node(S value){
			this.value = value;
		}
	}
	
	public class ValueComparator<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			/*if(){
				
			}*/
			return -1;
		}
	}
	
	public class BST<E extends Comparable<? super E>>{
		
	}
	

}
