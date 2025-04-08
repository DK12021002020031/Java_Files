package singly_linked_list;

import java.util.Scanner;

public class SinglyLinkedList {

	Node head, tail;

	static int count;
	
	static Scanner sc = new Scanner(System.in);

	public void insert(int data) {

		Node newNode = new Node(data);

		if (this.head == null) {

			this.head = newNode;
			this.tail = newNode;
		} else {

			this.tail.next = newNode;

			this.tail = newNode;
		}

		count++;
	}

	public void displayList() {

		Node ptr = this.head;

		if (ptr == null) {
			System.err.println("List is empty!");
			return;
		}

		while (ptr != null) {

			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}

		System.out.println("null");

		System.out.println();
	}

	public void updateAtIndex(int index, int newData) {
		
		if (index <1 || index > count) {
			System.err.println("Out of Bounds! Enter the index between 1 and " + count);
			return;
		}

		int currIndex = 1;

		Node ptr = this.head;

		if (ptr == null) {
			System.err.println("List is empty!");
			return;
		}

		while (ptr != null && currIndex != index) {

			ptr = ptr.next;

			currIndex++;
		}

		ptr.data = newData;
	}
	
	public void insertAtIndex(int index,int newData) {
		
		if (index <1 || index > count) {
			System.err.println("Out of Bounds! Enter the index between 1 and " + count);
			return;
		}
		
		Node newNode=new Node(newData);
		
		if(head==null) {
			
			System.err.println("Sorry, the list is empty!");
			
		    System.out.println("Do you want to add this in the list? (yes/no)");
		    
		    String ch=sc.next();
		    
		    if(ch.equals("yes")) {
		    	
		    	head=newNode;
		    	
		    	System.out.println("Node is added!");
		    }
		    
		    return;
		}
		
		Node ptr=this.head;
		
		int currIndex=1;
		
		if(index==1) {
			
			newNode.next=head;
			
			head=newNode;
			
			return;
		}
		
		while(ptr!=null && currIndex<index-1) {
			
			ptr=ptr.next;
			
			currIndex++;
		}	
		
		newNode.next=ptr.next;
		
		ptr.next=newNode;
	}
	
    public void deleteAtIndex(int index) {
    	
    	if (index <1 || index > SinglyLinkedList.count) {
			System.err.println("Out of Bounds! Enter the index between 1 and " + SinglyLinkedList.count);
			return;
		}
	
    	Node ptr=this.head;
		
		int currIndex=1;
		
		if(index==1) {
			
			ptr=ptr.next;
			
			head=ptr;
	        
			return;
		}
		
		while(ptr!=null && currIndex<index-1) {
			
			ptr=ptr.next;
			
			currIndex++;
		}
		
		Node temp=ptr.next;
		
		ptr.next=ptr.next.next;
		
		temp=null;
	}
}
