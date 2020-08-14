package principal;

import java.util.Scanner;

import DollarToReal.CurrencyConverter;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		System.out.println("\nAmount to be paid in reais = R$" + String.format("%.2f", CurrencyConverter.Convert(price, dollar)));

		sc.close();
	}
	
	

}
