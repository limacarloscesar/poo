package br.edu.iftm.simulado2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;


@Entity
public class Computador {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
		
	@Id
	@GeneratedValue
	private int id;
	private String marca, modelo, processador;
	private int hd, memoria;
	
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
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getId() {
		return id;
	}
	
	public Computador() {}
	
	public Computador(String marca, String modelo, String processador, int hd,
			int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
		this.hd = hd;
		this.memoria = memoria;
	}
	
	
	public static void buscaComputador(int id){
		try {
			Computador comp = em.find(Computador.class, id);
			System.out.println("COMPUTADOR");
			System.out.println("Marca: " + comp.getMarca());
			System.out.println("Modelo: " + comp.getModelo()); 
			System.out.println("Processador: " + comp.getProcessador());
			System.out.println("Tamanho do hd: " + comp.getHd());
			System.out.println("Quantidade de memória: " + comp.getMemoria());
		} catch (Exception e) {
			System.out.println("Equipamento não encontrado");
		}
	}
	
	public static void gravaComputador(Computador comp){
		em.getTransaction().begin();
		em.persist(comp);
		em.getTransaction().commit();
	}
	
		
}
