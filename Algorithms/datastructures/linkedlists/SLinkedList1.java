package datastructures.linkedlists;

public class SLinkedList1<E> {

	Node<E> head; //Sentinel
	int size;
	
	SLinkedList1(){
		head = new Node<E>(null); 
		size = 0;
	}
	
	
	public void add(E data){
		Node<E> newNode = new Node<E>(data);
		Node<E> currentNode = head;
		while(true){
			if(currentNode.next == null){
				currentNode.next = newNode;
				size++;
				return;
			}
			else {
				currentNode = currentNode.next;
			}
		}
	}
	
	class Node<T> {
		Node<T> next;
		T data;
		
		Node(T data){
			this.data = data;
		}
		public String toString(){
			return data+"";
		}
	}
	
	
	
	
}
