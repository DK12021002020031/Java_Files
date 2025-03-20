package day_6;

import java.util.Scanner;

public class Two_Dimensional_Arrays {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a number: ");

		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		System.out.println("Enter the values of matrix: ");

		for (int row = 0; row < n; row++) {

			for (int col = 0; col < n; col++) {

				arr[row][col] = sc.nextInt();
			}
		}

		System.out.println("The output matrix is: ");

		for (int row = 0; row < n; row++) {

			for (int col = 0; col < n; col++) {

				System.out.print(arr[row][col] + " ");
			}

			System.out.println();
		}
	}

}
