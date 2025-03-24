package one_to_many_association;

import java.util.Scanner;

public class UserDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size: ");

		int size = sc.nextInt();

		User user = new User(size, "Diprit");

		boolean flag = true;

		while (flag) {

			System.out.println("Enter 1 to add a post\nEnter 2 to display user's posts\nEnter 3 to exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Post ID: ");

				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Type the post: ");

				String description = sc.nextLine();

				Posts post = new Posts(id, description);

				user.addPost(post);
				break;

			case 2:
				user.displayUserPosts();
				break;
			case 3:
				System.out.println("Thank you Visit Again!");
				flag = false;
				break;
			}
		}

		sc.close();

	}

}
