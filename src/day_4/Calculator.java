package day_4;

import java.util.Scanner;

public class Calculator {
	
	public static Scanner sc=new Scanner(System.in);

	public static void addMenu() {
		
		System.out.println("Enter 1 to add two numbers\nEnter 2 to add three numbers");
		
		int choice=sc.nextInt();
		
		switch(choice){
		
		case 1:{
			System.out.println("Enter the first number");
			int num1=sc.nextInt();
			System.out.println("Enter the first number");
			int num2=sc.nextInt();
			
			System.out.println(num1+num2);
		}
		break;
		case 2:{
			System.out.println("Enter the first number");
			int num1=sc.nextInt();
			System.out.println("Enter the first number");
			int num2=sc.nextInt();
			System.out.println("Enter the first number");
			int num3=sc.nextInt();
			
			System.out.println(num1+num2+num3);
		}
		break;
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public static void divMenu() {
		
		System.out.println("Enter the numerator");
		int numerator=sc.nextInt();
		System.out.println("Enter the denominator");
		int denominator=sc.nextInt();
		
		if(denominator==0) {
			System.out.println("Denominator cannot be Zero");
		}
		else {
			System.out.println(numerator/denominator);
		}
	}

}
