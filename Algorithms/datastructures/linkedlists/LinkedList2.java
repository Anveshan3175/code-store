package datastructures.linkedlists;

/* In this linked list we are using two auxiliary nodes.
 * The auxiliary nodes always exist
 */
public class LinkedList2<E> {

	private Node<E> start;
	private Node<E> end;
	private int size;

	LinkedList2(){
		start = new Node<E>(null);
		end = new Node<E>(null);
		start.rightNode = end;
		end.leftNode = start;
	}
	
	public void add(E value){
		Node<E> newNode = new Node<E>(value);
		Node<E> currentNode;
		
		if(start.rightNode == end){
			start.rightNode = newNode;
			end.leftNode = newNode;
			newNode.leftNode = start;
			newNode.rightNode = end;
			size++;
		}
		else {
			currentNode = start.rightNode;
			while(true){
				if(currentNode.rightNode == end){
					currentNode.rightNode = newNode;
					newNode.leftNode = currentNode;
					newNode.rightNode = end;
					size++;
					return;
				}
				else {
					currentNode =  currentNode.rightNode;
				}
			}
		}
	}
	
	public int getSize(){
		return size;
	}
	
	
	class Node<T> {
		Node<E> leftNode;
		Node<E> rightNode;
		E value;
		
		Node(E value){
			this.value = value;
		}
		
		public String toString(){
			return value+"";
		}
	}
	
	public int sum(int a,int b){
		return a + b;
	}
}
