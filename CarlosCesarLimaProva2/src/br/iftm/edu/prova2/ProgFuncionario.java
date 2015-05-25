package br.iftm.edu.prova2;

import java.util.Scanner;

public class ProgFuncionario {
	static Scanner scan = new Scanner(System.in);
	static Funcionario funcio = new Funcionario();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Menu Funcionário\n 1 - Cadastra\n 2 - Consulta\n 3 - Sair");
		int opcao = Integer.parseInt(scan.nextLine());
		
		switch (opcao) {
		case 1:
			cadastra();
			break;
		case 2:
			consulta();
			break;
		case 3:
			sair();
			break;
		default:
			break;
		}
		

	}
	
	

	
public static void cadastra(){
		System.out.println("Cadastro Funcionário");
		System.out.println("Nome: ");
		funcio.setNome(scan.nextLine());
		System.out.println("Função: ");
		funcio.setFuncao(scan.nextLine());
		System.out.println("Idade: ");
		funcio.setIdade(scan.nextInt());
		
		Funcionario.salvaFuncionario(funcio);
	}
	
	public static void consulta(){
		System.out.println("Digite o id do Funcionário: ");
		Funcionario.buscaFuncionario(scan.nextInt());
	}
	
	public static void sair(){
		System.out.println("saindo do sistema");
		System.exit(0);
	}

}
