package stack_using_array;

public class Stack {
	int top;
	int capacity;
	int[] arr;
	
	Stack(int size){
		this.arr = new int[size];
		top=-1;
		capacity=size;
	}
	
	public void push(int data) {
		if(top==capacity-1) {
			System.out.println("Stack overflow");
			return;
		}
		arr[++top] = data;
	}
	
	public int pop() {
		if(top==-1) {
			throw new RuntimeException("Stack underflow");
		}
		return arr[top--];
	}
	
	public int peek() {
		if(top==-1) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[top];
	}
	
	public void display() {
		if(top==-1) {
			throw new RuntimeException("stack is empty");
		}
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public boolean isEmpty() {
		return top==-1?true:false;
	}
	
	public boolean isFull() {
		return top==capacity-1?true:false;
	}
}
