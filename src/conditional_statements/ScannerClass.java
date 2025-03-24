package conditional_statements;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give the input: ");
		
		sc.useDelimiter(",");
		
		int num=sc.nextInt();
		
		sc.nextLine();
		
		String str=sc.nextLine();
		
		System.out.println(num);
		
		System.out.println(str);
	}

}
