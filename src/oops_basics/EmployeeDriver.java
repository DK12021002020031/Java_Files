package oops_basics;

import java.util.Scanner;

public class EmployeeDriver {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of employees: ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Enter the details of employee " + i + ": ");

			System.out.println("Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("name: ");
			String name = sc.nextLine();

			System.out.println("Company Name: ");
			String companyName = sc.nextLine();

			System.out.println("Salary: ");
			int salary = sc.nextInt();
			sc.nextLine();

			Employee e = new Employee(id, name, companyName, salary);
			
			System.out.println();
		}

	}

}
