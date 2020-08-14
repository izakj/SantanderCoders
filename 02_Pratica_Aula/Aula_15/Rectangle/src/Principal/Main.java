package Principal;

import java.util.Scanner;

import Complement.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Function fct = new Function();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width = ");
		fct.width = sc.nextDouble();
		
		System.out.print("Height = ");
		fct.height = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("AREA : " + String.format("%.2f", fct.Area()) + " area units.");
		System.out.println("PERIMETER : " + String.format("%.2f", fct.Perimeter()) + " linear units.");
		System.out.println("DIAGONAL : " + String.format("%.2f", fct.Diagonal()) + " linear units.");
		
		System.out.println(fct);
		sc.close();

	}

}
