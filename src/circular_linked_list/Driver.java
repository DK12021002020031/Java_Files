package circular_linked_list;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();

		boolean flag = true;

		while (flag) {

			System.out.println("Enter 1 to insert the data \n"
					+ "Enter 2 to display the list \n"
					+ "Enter 3 to update the list at a position\n"
					+ "Enter 4 to insert at a position \n"
					+ "Enter 5 to delete at a position \n"
					+ "Enter 6 to exit\n"
					+ "I am gandu btw and I love Monalisa");
			
			int n = list.sc.nextInt();

			switch (n) {

			case 1: {
				System.out.println("Enter the data : ");

				int val = list.sc.nextInt();

				list.insert(val);

				break;
			}
			case 2: {

				list.displayList();
				break;
			}
			case 3: {
				System.out.println("Please input the index to be updated: ");
				int index = list.sc.nextInt();

				System.out.println("Please input the new data: ");
				int newData = list.sc.nextInt();

				list.updateAtIndex(index, newData);
				break;
			}
			case 4: {
				System.out.println("Please input the index to insert: ");
				int index = list.sc.nextInt();

				System.out.println("Please input the data of new node: ");
				int newData = list.sc.nextInt();

				list.insertAtIndex(index, newData);
				break;
			}
			case 5: {
				System.out.println("Please input the index to delete: ");
				int index = list.sc.nextInt();
				
				list.deleteAtIndex(index);
				break;
			}
			case 6: {

				flag = false;
				break;

			}
			default:
				System.err.println("Invalid Input!");
				break;
			}
		}
	}
  
}
