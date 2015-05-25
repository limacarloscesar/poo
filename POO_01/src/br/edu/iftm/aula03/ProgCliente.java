package br.edu.iftm.aula03;

public class ProgCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		
		c1.setNome("Carlos");
		c1.setEndereco("Rua J");
		c1.setCpf(123412341);
		
		c2.setNome("Julio");
		c2.setEndereco("Rua K");
		c2.setCpf(12345641);
		
		System.out.println("Nome : " + c1.getNome());
		System.out.println("Endereço : " + c1.getEndereco());
		System.out.println("CPF :" + c1.getCpf());
		
		System.out.println("Nome : " + c2.getNome());
		System.out.println("Endereço : " + c2.getEndereco());
		System.out.println("CPF :" + c2.getCpf());

	}

}
