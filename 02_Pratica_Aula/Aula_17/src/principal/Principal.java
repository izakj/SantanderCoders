package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<Contato> contatos = new ArrayList<>();
	
	static int id, age, number, opt;
	static String name, phone, street, neighborhood, city, state;

	public static void main(String[] args) {
		
		do {
			System.out.printf("**** Main Menu *****\n");
			System.out.printf("[ 1 ] Add\n");
			System.out.printf("[ 2 ] Delete\n");
			System.out.printf("[ 3 ] List\n");
			System.out.printf("[ 4 ] Search\n");
			System.out.printf("[ 0 ] Close\n");
			System.out.print("\nSelect Option: ");
			opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				addContact();
				break;
			case 2:
				removeContact();
				break;
			case 3:
				listContact();
				break;
			case 4:
				searchContact();
				break;
			case 0:
				System.out.println("****** Program Ended ******");
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
			
		}while(opt != 0);
		
		sc.close();

	}
	
	static public void addContact() {
		
		System.out.print("Enter ID number: ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Phone: ");
		phone = sc.nextLine();
		
		//Endereço
		System.out.print("Enter Street: ");
		street = sc.nextLine();
		
		System.out.print("Enter Number: ");
		number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Neighborhood: ");
		neighborhood = sc.nextLine();
		
		System.out.print("Enter City: ");
		city = sc.nextLine();
		
		System.out.print("Enter State: ");
		state = sc.nextLine();
		System.out.println("");
		
		contatos.add(new Contato(id, name, age, phone,
				 new Endereco(street, number, neighborhood, city, state)));
		
		System.out.println();
		System.out.println("Cadastro Realizado com sucesso" + "\n");
		
	}
	
	static public void removeContact() {
		System.out.print("Enter ID number to be removed: ");
		int idremove = sc.nextInt();
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getId() == idremove) {
				contatos.remove(i);
			};
		};
	}
	
	static public void searchContact() {
		System.out.print("Enter ID number to be searched: ");
		int idsearch = sc.nextInt();
		for (Contato c: contatos) {
			if (c.getId() == idsearch) {
				System.out.println(c);
			};
		};
		System.out.println("--------------------");
		System.out.println("");
	
	}
	
	static public void listContact() {
		System.out.println("");
		for (Contato c: contatos) {
			System.out.println(c);
		};
		System.out.println("--------------------");
		System.out.println("");

	}

}
