package loops;

import java.util.Scanner;

public class Palindrome_Numbers {
	
	public static Scanner sc = new Scanner(System.in);
	
public static int[] createArray() {
	
	System.out.println("Enter the size of the array: ");

	int n = sc.nextInt();

	int arr[] = new int[n];

	System.out.println("Enter the numbers: ");

	for (int i = 0; i < n; i++) {

		int x = sc.nextInt();

		arr[i] = x;
	}
	
	return arr;
}

	public static boolean isPalindrome(int num) {

		String NumberString = Integer.toString(num);

		int idx = 0;

		while (num > 0) {
			int digit = num % 10;

			if (digit != (NumberString.charAt(idx) - '0'))
				return false;

			idx++;

			num /= 10;
		}

		return true;
	}

	public static void main(String[] args) {

		int arr[]=createArray();
		
		System.out.println("The palindrome numbers are: ");

		for (int i = 0; i < arr.length; i++) {

			if (isPalindrome(arr[i])) {

				System.out.println(arr[i]);
			}
		}

		sc.close();

	}
}