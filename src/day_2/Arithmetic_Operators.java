package day_2;

import java.util.Scanner;

public class Arithmetic_Operators {

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

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < 4; i++) {

			int x = sc.nextInt();

			arr[i] = x;
		}

		for (int i = 0; i < 4; i++) {

			if (isPalindrome(arr[i])) {

				System.out.println(arr[i]);
			}
		}

		sc.close();

	}
}