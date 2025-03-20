package day_5;

import java.util.Scanner;

public class Loop_Types {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n,fact=1;
		
		System.out.println("Enter the number: ");
		
		n=sc.nextInt();
		
        for(int i=2;i<=n;i++) {
        	
        	fact*=i;
        }
        
        System.out.println("The factorial of "+n+" is: "+fact);

	}

}
