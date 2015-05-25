package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Smart {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String marca, modelo, processador;
	private int memoria, tela;
	
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
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getTela() {
		return tela;
	}
	public void setTela(int tela) {
		this.tela = tela;
	}
	public Smart(String marca, String modelo, String processador, int memoria,
			int tela) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
		this.memoria = memoria;
		this.tela = tela;
	}
	public Smart() {
		super();
	}
	
	public static void salvaSmart(Smart smart){
		em.getTransaction().begin();
		em.persist(smart);
		em.getTransaction().commit();
	}
	
	public static void buscaSmart(int id){
		try {
			Smart smart = em.find(Smart.class, id);
			System.out.println("Smartphone");
			System.out.println("Marca: " + smart.getMarca());
			System.out.println("Modelo: " + smart.getModelo());
			System.out.println("Processador: " + smart.getProcessador());
			System.out.println("Quantidade de memória: " + smart.getMemoria() + " GB");
			System.out.println("Tamanho da tela: " + smart.getTela() + " Polegadas");
		} catch (Exception e) {
			System.out.println("Smartphone não encontrado");
		}
		
		
	}
	
	
	
	

}
