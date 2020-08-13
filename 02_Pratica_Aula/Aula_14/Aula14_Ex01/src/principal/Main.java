package principal;

import java.util.Scanner;

import Exercicio_Stock.Stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stock pdt1 = new Stock();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		pdt1.nome = sc.nextLine();
		
		System.out.print("Price: ");
		pdt1.preco = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		pdt1.qtd = sc.nextInt();
		
		System.out.println("Product data: "+ pdt1.nome + ", $" + pdt1.preco + ", " + pdt1.qtd + " units, Total:" + pdt1.TotalValueInStock());
		
		System.out.print("Enter the number of products to be added in stock: ");
    	int qtd = sc.nextInt();
		pdt1.adc(qtd);
		System.out.println("Product data: " + pdt1.nome + ", $" + pdt1.preco + ", " + pdt1.qtd + " units, Total: $" + pdt1.TotalValueInStock());
		
		System.out.print("Enter the number of products to be removed in stock: ");
    	qtd = sc.nextInt();
		pdt1.rmv(qtd);
		System.out.println("Product data: " + pdt1.nome + ", $" + pdt1.preco + ", " + pdt1.qtd + " units, Total: $" + pdt1.TotalValueInStock());
		sc.close();

	}

}
