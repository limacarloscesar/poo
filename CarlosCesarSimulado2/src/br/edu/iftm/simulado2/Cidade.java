package br.edu.iftm.simulado2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Cidade {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String nome, estado;
	private int dimensao;
	
	
	public void setId(int id) {
		this.id = id;
	}
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
	public int getDimensao() {
		return dimensao;
	}
	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}
	
	public Cidade(String nome, String estado, int dimensao) {
		this.nome = nome;
		this.estado = estado;
		this.dimensao = dimensao;
	}
	public Cidade() {}
	
	public static void salvaCidade(Cidade cidade){
		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();
	}
	
	public static void buscaCidade(int id){
		try {
			Cidade cidade = em.find(Cidade.class, id);
			System.out.println("Nome: " + cidade.getNome());
			System.out.println("Estado: " + cidade.getEstado());
			System.out.println("Dimensão: " + cidade.getDimensao());
		} catch (Exception e) {
			System.out.println("Cidade não encontrada");
		}		
		
	}
	
	
	

}
