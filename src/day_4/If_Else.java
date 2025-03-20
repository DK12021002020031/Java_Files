
package day_4;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num1 = sc.nextInt();

		if (num1 >= 0 & num1 % 2 == 0) {

			System.out.println("Positive Even");
			
		} else if (num1 >= 0 & num1 % 2 != 0) {

			System.out.println("Positive Odd");
			
		} else if (num1 < 0 & num1 % 2 != 0) {

			System.out.println("Negative Odd");
			
		} else if (num1 < 0 & num1 % 2 == 0) {

			System.out.println("Negative Even");
		}

		sc.close();

	}

}
