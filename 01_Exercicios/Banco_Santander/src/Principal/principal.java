package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conta.Cliente;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Cliente> clientes = new ArrayList<>();
		
		do {
			System.out.println("Insira os dados do cliente: ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			if (id <0) {
				System.out.println("Obrigado por visitar o Santander!");
				break;
			}
			
			System.out.print("Sobrenome: ");
			sc.nextLine();
			String sobrenome = sc.nextLine();
			
			System.out.print("RG: ");
			int rg = sc.nextInt();
			
			System.out.print("CPF: ");
			sc.nextLine();
			int cpf = sc.nextInt();
			
			char opt = ' ';
								
			do {
				System.out.println("\nTipo de conta: ");
				System.out.println("[C] Corrente");
				System.out.println("[P] Poupança");
				
				opt = sc.next().toUpperCase().charAt(0);
				
				if ((opt != 'P') && (opt != 'C')) {
					System.out.println("");
					System.out.println("Opção Inválida!");
					System.out.println("Entre uma opção válida: ");
				};
			}while((opt != 'P') && (opt != 'C'));
			
			
			if (opt == 'C') {
				
				System.out.print("\nSaldo inicial: ");
				double saldo = sc.nextDouble();
				System.out.print("\nLimite do cheque especial: ");
				double limiteChequeEspecial = sc.nextDouble();
				
				
				clientes.add(new Cliente(id, sobrenome, rg, cpf,
							 new ContaCorrente(saldo, limiteChequeEspecial)));
				
			} else if (opt == 'P') {
				
				System.out.print("\nSaldo inicial: ");
				double saldo = sc.nextDouble();
				
				System.out.print("Juros: ");
				double juros = sc.nextDouble();
				
				
				clientes.add(new Cliente(id, sobrenome, rg, cpf,
							new ContaPoupanca(saldo, juros)));
			}
			
			System.out.println();
			for (Cliente i : clientes) {
				System.out.println(i);
				
			}
		
		}while (true);
		
		sc.close();
	}
}