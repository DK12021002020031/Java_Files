package doubly_linked_list;

import java.util.Scanner;

public class DoublyLinkedList {
	
	Node head,tail;
	
	static int count;
	
	static Scanner sc = new Scanner(System.in);

	public void insert(int data) {

		Node newNode = new Node(data);

		if(head==null) {
			
			head=newNode;
			
			tail=newNode;
		}
		else {
			
			tail.next=newNode;
			newNode.prev=tail;
		}

		count++;
	}
	
	public void displayFromFront() {
		
		if(head==null) System.err.println("List is empty!");
		
		Node ptr=head;

		while(ptr!=null) {
		
			System.out.println(ptr.data+" -> ");
		    ptr=ptr.next;
	   }
		
		System.out.println("null");
	}
	
	public void displayFromBack() {
		
		if(tail==null) System.err.println("List is empty!");
			
		Node ptr=tail;
		
		while(ptr!=null) {
			
			System.out.println(" <- "+ptr.data);
			ptr=ptr.prev;
		}
		
		System.out.println("null");
	}
	
	public void updateAtIndex(int index,int newData) {
		
		if(head==null) System.out.println("List is empty!");
		
		if(index<0 || index>count) {
			
			System.err.println("Out of Bounds!");
		}
		
		int currIndex=1;
		
		Node ptr=head;
		
		while(currIndex<index) {
			
			currIndex++;
			ptr=ptr.next;
		}
	}
}
