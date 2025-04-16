package stack_using_array;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		Stack stack = new Stack(size);
		while(flag) {
			System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to display\nEnter 5 to check if "
					+ "stack if full\nEnter 6 to check if stack is empty\nEnter 7 to exit");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the data");
					int data = scan.nextInt();
					stack.push(data);
					break;
				case 2:
					try{
						System.out.println(stack.pop()+" "+"is popped");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					try {
						System.out.println(stack.peek());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					try {
						stack.display();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5:
					try {
						System.out.println(stack.isFull());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 6:
					try {
						System.out.println(stack.isEmpty());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 7:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
