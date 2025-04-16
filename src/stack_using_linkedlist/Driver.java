package stack_using_linkedlist;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack();
		while(flag) {
			System.out.println("Enter 1 to push\nEnter 2 to display\nEnter 3 to peek\nEnter 4 to pop\nEnter 5 to check"
					+ "if stack is empty\nEnter 6 to exit");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the data");
					int data = scan.nextInt();
					stack.push(data);
					break;
				case 2:
					stack.display();
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
						System.out.println(stack.pop());
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 5:
					System.out.println(stack.isEmpty());
					break;
				case 6:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
