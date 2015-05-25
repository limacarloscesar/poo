package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Escola {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String nome, estado, cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getId() {
		return id;
	}
	public Escola(String nome, String estado, String cidade) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.cidade = cidade;
	}
	public Escola() {
		super();
	}
	
	public static void buscaEscola(int id){
		try {
			Escola escola = em.find(Escola.class, id);
			System.out.println("Dados Escola");
			System.out.println("Nome: " + escola.getNome());
			System.out.println("Cidade: " + escola.getCidade());
			System.out.println("Estado: " + escola.getEstado());
		} catch (Exception e) {
			System.out.println("Escola não encontrada");
		}
	}
	
	public static void salvaEscola(Escola escola){
		em.getTransaction().begin();
		em.persist(escola);
		em.getTransaction().commit();
	}
	

}
