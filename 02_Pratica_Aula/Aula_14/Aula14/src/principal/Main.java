package principal;

import java.util.Scanner;

import geometria.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//double xA, xB, xC, yA, yB, yC;
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area(); 
		
		System.out.println("O valor da �rea de X �: " + areaX);
		System.out.println("O valor da �rea de Y �: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("A �rea de X � maior!");
		}else {
			System.out.println("A �rea de Y � maior!");
		}
	}

}










