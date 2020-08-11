package exercicios_aula_13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
System.out.println("Entre com idade: ");
		
		//Considerando Final de Semana como Sábado e Domingo
	
		int op = 0;
		
		do {
			
			System.out.println("Escolha uma opção: ");
			
			System.out.println("1 - Domingo");
			System.out.println("2 - Segunda-Feira");
			System.out.println("3 - Terça-Feira");
			System.out.println("4 - Quarta-Feira");
			System.out.println("5 - Quinta-Feira");
			System.out.println("6 - Sexta-Feira");
			System.out.println("7 - Sábado");
			
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			
			if((op == 1) || (op == 7)){
				System.out.println("É Fim de Semana!");
			} else if((op > 1) && (op < 7)){
				System.out.println("É Dia Útil!");
			} else {
				System.out.println("Valor Inválido!");
				System.out.println("Entre com um valor válido: ");
			}

		}while((op < 1)||(op > 7));
		
	}
	
}