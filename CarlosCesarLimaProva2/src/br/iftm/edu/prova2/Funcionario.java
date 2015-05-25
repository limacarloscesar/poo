package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Funcionario {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue

	private int id;
	private String nome, funcao;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public Funcionario(String nome, String funcao, int idade) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.idade = idade;
	}
	public Funcionario() {
		super();
	}
	public static void salvaFuncionario(Funcionario funcio){
		em.getTransaction().begin();
		em.persist(funcio);
		em.getTransaction().commit();
	}
	public static void buscaFuncionario(int id){
		try {
			Funcionario funcio = em.find(Funcionario.class, id);
		System.out.println("Funcionário");
		System.out.println("Nome: " + funcio.getNome());
		System.out.println("Função: " + funcio.getFuncao());
		System.out.println("Idade: " + funcio.getIdade());
		} catch (Exception e) {
			System.out.println("Funcionário não encontrado");
		}
		
		
	}
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	
	
}
