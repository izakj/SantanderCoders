package exercicios_aula_13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
System.out.println("Entre com idade: ");
		
		int age = -1;
		
		do {
			Scanner sc = new Scanner(System.in);
			age = sc.nextInt();
			
			if((age < 18) && (age >= 0)){
				System.out.println("É menor de idade.");
			} else if(age >= 18){
				System.out.println("É maior de idade.");
			} else {
				System.out.println("Idade Inválida!");
				System.out.println("Entre com um valor válido: ");
			}
			
		}while(age < 0);
		
	}
	
}