package Principal;

import java.util.Scanner;

import Student.FinalGrade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		FinalGrade grd = new FinalGrade();
		
		System.out.print("Name: ");
		grd.name = sc.nextLine();
		
		
		
		grd.grade1 = 0.0;
		
		do {
			System.out.print("Grade 1st trimester = ");
			grd.grade1 = sc.nextDouble();
			if ((grd.grade1<0)||(grd.grade1>30)) {
				System.out.println("INVALID GRADE!");
				System.out.println("ENTER A VALID GRADE!");
				System.out.println("");
			}
		} while ((grd.grade1<0)||(grd.grade1>30));
		
		
		grd.grade2 = 0.0;
		
		do {
			System.out.print("Grade 2nd trimester = ");
			grd.grade2 = sc.nextDouble();
			if ((grd.grade2<0)||(grd.grade2>35)) {
				System.out.println("INVALID GRADE!");
				System.out.println("ENTER A VALID GRADE!");
				System.out.println("");
			}
		} while ((grd.grade2<0)||(grd.grade2>35));
		
		grd.grade3 = 0.0;
		
		do {
			System.out.print("Grade 3rd trimester = ");
			grd.grade3 = sc.nextDouble();
			if ((grd.grade3<0)||(grd.grade3>35)) {
				System.out.println("INVALID GRADE!");
				System.out.println("ENTER A VALID GRADE!");
				System.out.println("");
			}
		} while ((grd.grade3<0)||(grd.grade3>35));
		
		System.out.println("");
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", grd.Final()));
		System.out.println(grd.Evaluation());
		
		if (grd.Evaluation() == "FAILED") {
			System.out.println("MISSING " + String.format("%.2f", grd.Missing()));
		}
		


	}

}
