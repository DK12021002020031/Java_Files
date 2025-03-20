package day_5;

import java.util.Scanner;

public class Armstrong_Number {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		
		int n=num;
		
		int  countDigits=(int) (Math.floor(Math.log10(n))+1);
		
		int sum=0;
		
		while(n>0) {
			
			int digit=n%10;
			
			sum+=Math.pow(digit,countDigits);
			
			n/=10;
		}
		
		if(sum==num) {
			
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstrong Number");
		}
		
	}
	
}
