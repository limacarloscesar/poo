package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;


@Entity
public class Aviao {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String marca, modelo, anoFabricacao;
	
	
	public Aviao() {
		super();
	}
	public Aviao(String marca, String modelo, String anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getId() {
		return id;
	}
	
	public static void salvaAviao(Aviao nave){
		em.getTransaction().begin();
		em.persist(nave);
		em.getTransaction().commit();
	}
	
	public static void buscaAviao(int id){
		try {
			Aviao nave = em.find(Aviao.class, id);
		System.out.println("Avião");
		System.out.println("Marca: " + nave.getMarca());
		System.out.println("Modelo: " + nave.getModelo());
		System.out.println("Ano de Fabricação: " + nave.getAnoFabricacao());
		} catch (Exception e) {
			System.out.println("Avião não encontrado");
		}
		
		
	}
	

}
