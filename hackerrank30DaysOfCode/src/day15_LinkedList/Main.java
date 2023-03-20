package day15_LinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList linkedList = new MyLinkedList(); 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			linkedList.addTail(scan.nextInt());
		}
		
		linkedList.getAll();

		scan.close();
	}

}


class Node {
	int num;
	Node next;
	
	public Node(int num) {
		this.num = num;
		this.next = null;
	}
	
}

class MyLinkedList{
	Node head;
	Node tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addHead(int num) {
		Node newNode = new Node(num);
		if (!isListEmpty()) {
			newNode.next = head;
			head = newNode;
		}
		else {
			head = newNode;
			tail = newNode;
		}
	}
	
	public void addTail(int num) {
		Node newNode = new Node(num);
		if (!isListEmpty()) {
			tail.next = newNode;
			tail = newNode;
			
		}
		else {
			head = newNode;
			tail = newNode;
		}
		
	}
	
	public void getAll() {
		Node node = head;
		while (node != null) {
			System.out.print(node.num);
			node = node.next;
		}
		
	}
	
	
	private boolean isListEmpty() {
		if (head == null) {
			return true;
		}
		return false;
		
	}
	
}


