package circular_linked_list;

import java.util.Scanner;

public class CircularLinkedList {
	
	Node head,tail;
	
	static int count;
	
	static Scanner sc = new Scanner(System.in);
	
	public void insert(int data) {
		
		Node newNode=new Node(data);
		
		count++;
		
		if(head==null) {
			
		  head=newNode;
		  
		  head.next=head;
		  
		  tail=head;
		  
		  return;
		}
		
		tail.next=newNode;
		
		newNode.next=head;
		
		tail=newNode;
	}
	
	public void displayList() {
		Node ptr=head;
		
		if(count==0) {
			
			System.err.println("List is empty!");
		}
		
		while(ptr.next!=head) {
			
			System.out.print(ptr.data+" -> ");
			
			ptr=ptr.next;
		}
		
		System.out.print(tail.data+" -> ");
		System.out.println(head.data+"(head)");

	}
	
	public void updateAtIndex(int index,int newData) {
		
		int k=index;
		
		if(k<1 || k>count) {
			
			System.err.println("Out of Bounds!");
			
			System.out.println("Do you still want to update the index in cicular format?(yes/no)");
			
			sc.nextLine();

			String str=sc.nextLine();
			
			if(str.equals("yes")) {
				
				k%=count;
			}
			else {
				
				System.err.println("Choose the index between 1 and "+count);
				return;
			}
		}
		
		int currIndex=1;
		
		Node ptr=head;
		
		while(currIndex!=k) {
			
			ptr=ptr.next;
			currIndex++;
		}
		
		ptr.data=newData;
		
		System.out.println("Node updated sucessfully!");
	}
	
	public void insertAtIndex(int index,int newData) {
		
		int k=index;
		
		if(k<1 || k>count) {
			
			System.err.println("Out of Bounds!");
			System.out.println("Do you still want to update the index in cicular format?(yes/no)");
	
			sc.nextLine();
			
			String str=sc.nextLine();
			
			if(str.equals("yes")) {
				
				k%=count;
			}
			else {
				
				System.err.println("Choose the index between 1 and "+count);
				return;
			}
		}
		
		Node newNode=new Node(newData);
		
		if(k==1) {
			
			newNode.next=head;
			newNode=head;
			tail.next=head;
			
			return;
		}
		
		int currIndex=1;
		
		Node ptr=head;
		
		while(currIndex!=k-1) {
			
			ptr=ptr.next;
			currIndex++;
		}
		
		newNode.next=ptr.next;
		
		ptr.next=newNode;
		
		System.out.println("Node added sucessfully!");
	}
	
	 public void deleteAtIndex(int index) {
	    	
	    	if (index <1 || index > count) {
				System.err.println("Out of Bounds! Enter the index between 1 and " + count);
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
