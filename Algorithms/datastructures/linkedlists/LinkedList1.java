package datastructures.linkedlists;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		list.add(0, 60);
		list.add(3, 72);
		list.add(7, 33);
		System.out.println(list);
		
		System.out.println(list.getSize());
	}
}


class LinkedList {
	
	private Node head;
	private Node tail;
	private Node currentNode;
	int size;
	
	class Node {
		int value;
		Node leftNode;
		Node rightNode;
		
		Node(int value){
			this.value = value;
		}
		
		public String toString(){
			return value+"";
		}
	}
	
	public void add(int num){
		if(head == null){
			head = new Node(num);
			tail = head;
			size++;
		}
		else {
			currentNode = head;
			while(currentNode.rightNode != null) {
				currentNode = currentNode.rightNode;
			}
			Node newNode = new Node(num);
			currentNode.rightNode = newNode;
			newNode.leftNode = currentNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index,int num){
		int i = 0;
		
		if(index == 0){
			Node newNode = new Node(num);
			newNode.rightNode = head;
			head.leftNode = newNode;
			head = newNode;
			size++;
		}
		else if(index == size){
			Node newNode = new Node(num);
			tail.rightNode = newNode;
			newNode.leftNode = tail;
			tail = newNode;
			size++;
		}
		else{
			currentNode = head;
			while(true){
				if(i == index-1) break;
				currentNode = currentNode.rightNode;
				i++;
			}
			Node newNode = new Node(num);
			newNode.rightNode = currentNode.rightNode;
			newNode.leftNode = currentNode;
			currentNode.rightNode = newNode;
			size++;
		}
	}
	
	public int getSize(){
		return size;
	}
	public String toString(){
		currentNode = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(currentNode != tail){
			sb.append(currentNode.value+",");
			currentNode = currentNode.rightNode;
		}
		sb.append(tail.value+"]");
		
		return sb.toString();
	}
}