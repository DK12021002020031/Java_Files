package singly_linked_list;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SinglyLinkedList list = new SinglyLinkedList();

		boolean flag = true;

		while (flag) {

			System.out.println("Enter 1 to insert the data \n "
					+ "Enter 2 to display the list \n "
					+ "Enter 3 to update the list at a position\n "
					+ "Enter 4 to insert at a position \n"
					+ "Enter 5 to exit");
			
			int n = sc.nextInt();

			switch (n) {

			case 1: {
				System.out.println("Enter the data : ");

				int val = sc.nextInt();

				list.insert(val);

				break;
			}
			case 2: {

				list.displayList();
				break;
			}
			case 3: {
				System.out.println("Please input the index to be updated: ");
				int index = sc.nextInt();

				if (index <1 || index > SinglyLinkedList.count) {
					System.out.println("Out of Bounds! Enter the index between 1 and " + SinglyLinkedList.count);
					break;
				}

				System.out.println("Please input the new data: ");
				int newData = sc.nextInt();

				list.updateAtIndex(index, newData);
				break;
			}
			case 4: {
				System.out.println("Please input the index to inert: ");
				int index = sc.nextInt();

				if (index <1 || index > SinglyLinkedList.count) {
					System.out.println("Out of Bounds! Enter the index between 1 and " + SinglyLinkedList.count);
					break;
				}

				System.out.println("Please input the data of new node: ");
				int newData = sc.nextInt();

				list.insertAtIndex(index, newData);
				break;
				
			}
			case 5: {

				flag = false;
				break;

			}
			default:
				System.out.println("Invalid Input!");
				break;
			}
		}

	}

}
