package exercicios;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		//Considerando sobriedade, cnh e maioridade
		
		int check  = 0;
		int age = -1;
		int sober = -1;
		int cnh = -1;
		Scanner sc = new Scanner(System.in);
		
		//Verificando a idade
		System.out.println("Entre com idade: ");
		do {
			age = sc.nextInt();
			
			if(age >= 18){
				check = check + 1;
			} else if(age <= 0){
				System.out.println("Idade Inválida!");
				System.out.println("Entre com um valor válido: ");
			}
		}while(age < 0);
		
		System.out.println("");
		
		//Verificando sobriedade
		do {
			System.out.println("O motorista encontra-se sóbrio?");
			System.out.println("Escolha uma opção: ");
			
			System.out.println("0 - Não");
			System.out.println("1 - Sim");

			sober = sc.nextInt();
			
			if(sober == 1){
				check = check + 1;
			} else if((sober < 0) || (sober > 1)){
				System.out.println("Valor Inválido!");
				System.out.println("Entre com um valor válido: ");
			} 

		}while((sober < 0) || (sober > 1));
		
		System.out.println("");
		
		//Verificando CNH
		do {
			System.out.println("O motorista possui uma carteira de motorista válida?");
			System.out.println("Escolha uma opção: ");
			
			System.out.println("0 - Não");
			System.out.println("1 - Sim");

			cnh = sc.nextInt();
			
			if(cnh == 1){
				check = check + 1;
			} else if((cnh < 0) || (cnh > 1)){
				System.out.println("Valor Inválido!");
				System.out.println("Entre com um valor válido: ");
			} 

		}while((cnh < 0) || (cnh > 1));
		
		System.out.println("");
		
		if(check == 3){
			System.out.println("O Motorista está apto para dirigir!");
		} else {
			System.out.println("O Motorista não está apto para dirigir!");
		}
		
	}
}