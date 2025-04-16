package stack_using_linkedlist;

public class Stack {
	Node top;
	
	public void push(int data) {
		Node node = new Node(data);
		node.next=top;
		top=node;
	}
	
	public void display() {
		if(top==null) {
			System.out.println("No data to display");
		}
		Node current = top;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public int peek() {
		if(top==null) {
			throw new RuntimeException("Stack is empty");
		}
		return top.data;
	}
	
	public int pop() {
		if(top==null) {
			throw new RuntimeException("Stack is empty");
		}
		Node current = top;
		int data = current.data;
		top = top.next;
		current.next=null;
		return data;
	}
	
	public boolean isEmpty() {
		return top==null?true:false;
	}
}
