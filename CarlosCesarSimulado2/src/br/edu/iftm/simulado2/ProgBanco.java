package br.edu.iftm.simulado2;

import java.util.Scanner;

public class ProgBanco {
static Scanner scan = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banco bank = new Banco();
		
		int opcao;
		
		System.out.println("BANCO \n" + "Digite 1 para cadastrar\n" 
		+ "Digite 2 para consultar\n" + "Digite 3 para sair");
		opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			System.out.println("Digite o nome do Banco: ");
			bank.setNome(scan.nextLine());
			System.out.println("Digite o número da agência: ");
			bank.setNumAgencia(Integer.parseInt(scan.nextLine()));
			System.out.println("Digite o endereço: ");
			bank.setEndereco(scan.nextLine());
			System.out.println("Digite o telefone:");
			bank.setTelefone(scan.nextInt());			;
			
			bank.salvaBanco(bank);
			break;
			
		case 2:
			System.out.println("Digite o id do Banco:");
			Banco.buscaBanco(scan.nextInt());
			break;
			
		case 3:
			System.out.println("Saindo do sistema");
			System.exit(0);
		
		default:
			break;
		}
				
		scan.close();
		
	}
			
		

}


