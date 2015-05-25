package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Condicionador {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String marca, modelo;
	private int potencia;
	private boolean status = false;
	
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
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public Condicionador() {
		super();
	}
	public Condicionador(String marca, String modelo, int potencia,
			boolean status) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.status = status;
	}
	
	public static void salvaConcionador(Condicionador condic){
		em.getTransaction().begin();
		em.persist(condic);
		em.getTransaction().commit();
	}
	
	public static void buscaCondicionador(int id){
		try {
			Condicionador condic = em.find(Condicionador.class, id);
			System.out.println("Condicionador de ar");
			System.out.println("Marca: " + condic.getMarca());
			System.out.println("Modelo: " + condic.getModelo());
			System.out.println("Potencia: " + condic.getPotencia());
			System.out.println("Status: " + condic.isStatus());
			
		} catch (Exception e) {
			System.out.println("Condicionador não encontrado");
		}
		
	}

}
