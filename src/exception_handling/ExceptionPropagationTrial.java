package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagationTrial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println(x / y);
		
		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Exception is handled!");
		
		} catch (InputMismatchException e) {
			
			System.out.println("Input Mismatch Exception is handled!");
		}

		try {

			int[] arr = { 1, 2, 3, 4, 5 };

			sc.nextLine(); // Absorb the buffer text (possibly string) that was given in the input

			System.out.println("Enter the index to access: ");
			System.out.println(arr[sc.nextInt()]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Out of Bounds Exception is handled!");
		}
		
		try {
			
			Class.forName("Demo");
			
		} catch (Exception e) {
			
			System.out.println("Exception handled!");
		}
		
		sc.close();
	}
}
