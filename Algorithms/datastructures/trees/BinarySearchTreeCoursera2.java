package datastructures.trees;


public class BinarySearchTreeCoursera2{

	private Node<Character> root;
	
	
	public boolean contains(Character c) {
		Node<Character> currentNode = root;
		
		currentNode = root;
		int comp;
		
		while(currentNode != null){
			comp = c.compareTo(currentNode.value);
			if(comp  == 0){
				return true;
			}
			else if(comp > 0){
				currentNode = currentNode.right;
			}
			else {
				currentNode = currentNode.left;
			}
		}
		return false;
	}
	
	/*public void add(Character value){
		if(root == null){
			root = new Node<Character>(value);
		}
		else {
			Node<Character> currentNode = root;
			while(true){
				if(value.charValue() >= currentNode.value.charValue()){
					if(currentNode.right == null){
						currentNode.right = new Node<Character>(value);
						return;
					}
					currentNode = currentNode.right;
				}
				else {
					if(currentNode.left == null){
						currentNode.left = new Node<Character>(value);
						return;
					}
					currentNode = currentNode.left;
				}
			}
		}
	}*/

	
	public boolean add(Character toInsert){
		if(root == null){
			root = new Node<Character>(toInsert);
		}
		else {
			Node<Character> currentNode = root;
			int comp = toInsert.compareTo(currentNode.value);
			while((comp < 0 && currentNode.left != null)|| (comp > 0 && currentNode.right != null) ){
				if(comp < 0) {
					currentNode = currentNode.left;
				}
				else {
					currentNode = currentNode.right;
				}
				
				comp = toInsert.compareTo(currentNode.value);
			}
			if(comp < 0) {
				currentNode.left = new Node<Character>(toInsert);
			}
			else if (comp > 0) {
				currentNode.right = new Node<Character>(toInsert);
			}
			else {
				return false;
			}
			
		}
		return true;
	}
	
	
	
	private class Node<Character>{
		
		Node<Character> left;
		Node<Character> right;
		Character value;
		
		Node(Character value){
			this.value = value;
		}
		
		public String toString(){
			return value.toString();
		}
	}
	
	

}
