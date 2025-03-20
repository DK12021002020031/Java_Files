package day_6;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Element_In_2D_Array {

	public static Scanner sc = new Scanner(System.in);

	public static int[][] createMatrix() {

		System.out.println("Enter the number: ");

		int n = sc.nextInt();

		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		return arr;
	}

	public static void displayMatrix(int[][] arr) {

		System.out.println("The matix is: ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}
	}

	public static int FindMaxElement(int[][] arr) {

		displayMatrix(arr);

		int maxVal = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				maxVal = Math.max(maxVal, arr[i][j]);
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {

		System.out.println("The max value in the matrix is: " + FindMaxElement(createMatrix()));

	}

}
