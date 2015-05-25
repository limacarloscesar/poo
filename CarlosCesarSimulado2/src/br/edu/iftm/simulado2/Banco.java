package br.edu.iftm.simulado2;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;


@Entity
public class Banco {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String nome, endereco;
	private int numAgencia, telefone;
	
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	
	public Banco(){}
	
	public Banco(String nome, String endereco, int numAgencia, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.numAgencia = numAgencia;
		this.telefone = telefone;
	}
	
	public void salvaBanco(Banco banco){
		em.getTransaction().begin();
		em.persist(banco);
		em.getTransaction().commit();
	}
		
	public static void buscaBanco(int id){
		try {
			Banco banco = em.find(Banco.class, id);
			System.out.println("Nome: " + banco.getNome());
			System.out.println("Número Agência: " + banco.numAgencia);
			System.out.println("Endereço: " + banco.endereco);
			System.out.println("Telefone: " + banco.telefone);
		} catch (Exception e) {
			System.out.println("Banco não encontrado");
		}
	}
	
	

}
