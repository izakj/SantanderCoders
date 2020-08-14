package principal;

import java.util.Scanner;

import Employee_Functions.Employee;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee epl = new Employee(); 
		
		System.out.print("Name: ");
		epl.Name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		epl.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		epl.Tax = sc.nextDouble();
		
		System.out.println("Employee : "+ epl.Name + ", $" + String.format("%.2f", epl.NetSalary()));
		
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		epl.IncreaseSalary(percentage);
		
		System.out.println("Updated data : "+ epl.Name + ", $" + String.format("%.2f", epl.NetSalary()));
		
		
		sc.close();

	}

}
