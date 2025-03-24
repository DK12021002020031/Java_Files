package conditional_statements;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice:\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n");
		
		int choice=sc.nextInt();
		
		switch(choice){
		
		case 1 :
			Calculator.addMenu();
			break;
		case 2:
			Calculator.divMenu();
			break;
		default:
			System.out.println("Invalid Input");
		}
       System.out.println("Thank you for using the calculator app");
	}

}
