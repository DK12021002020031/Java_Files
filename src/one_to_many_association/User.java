package one_to_many_association;

public class User {

	String userName;

	Posts[] posts;

	static int idx = 0;

	public User(int size, String userName) {

		this.userName = userName;

		posts = new Posts[size];
	}

	public void addPost(Posts post) {

		if (idx < posts.length) {

			posts[idx++] = post;

			System.out.println("Post has been created!");
		} else {

			System.out.println("Sorry, Memory Full!");
		}

		System.out.println("Post added!");
	}

	public void displayUserPosts() {

		System.out.println("User has following posts:");

		for (int i = 0; i < idx; i++) {

			System.out.println(posts[i].postID + " " + posts[i].postDescription);
		}
	}
}
