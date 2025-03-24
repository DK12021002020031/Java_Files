package operators;

import java.util.Scanner;

public class Conditional_Operators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers: ");

		int num1 = sc.nextInt();

		int num2 = sc.nextInt();

		int num3 = sc.nextInt();

		int greaterVal = num1 > num2 && num1 > num3 ? num1 : (num2 > num3 ? num2 : num3);

		System.out.println(greaterVal);

		sc.close();
	}
}