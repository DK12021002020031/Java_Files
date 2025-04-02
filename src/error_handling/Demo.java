package error_handling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers: ");
		try {

			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(x / y);
			sc.close();

		} catch (Exception e) {

			System.out.println("Exception is handled!");
		} finally {
			sc.close();

			System.out.println("Finally block is executed!");
		}

		// try-with-resources block
		try (Scanner s = new Scanner(System.in)) { // This Scanner object is usable only in this try block and
													// automatically gets closed even if we don't use "finally" keyword

			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(x / y);
			
		} catch (Exception e) {

			System.out.println("Exception is handled!");
		}

	}

}
