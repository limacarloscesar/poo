package br.edu.iftm.simulado2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
public class Televisao {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
	private static EntityManager em = factory.createEntityManager();
	
	@Id
	@GeneratedValue
	private int id;
	private String marca, modelo;
	private int volume = 0;
	private int canal = 3;
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
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
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
	
	
	
	public Televisao() {}
	
	public Televisao(String marca, String modelo, int volume, int canal,
			boolean status) {
		this.marca = marca;
		this.modelo = modelo;
		this.volume = volume;
		this.canal = canal;
		this.status = status;
	}
	
	public void buscaTelevisao(int id){
		try {
			Televisao tele =  em.find(Televisao.class, id);
			System.out.println("Televisão");
			System.out.println("Marca: " + tele.getMarca());
			System.out.println("Modelo: " + tele.getModelo());
			System.out.println("Volume: " + tele.getVolume());
			System.out.println("Canal: " + tele.getCanal());
			if(tele.isStatus())	System.out.println("TV ligado");
			else System.out.println("TV desligado");
		} catch (Exception e) {
			System.out.println("Televisão não encontrada");
		}
	}
	
	public  void gravaTv(Televisao tele){
		em.getTransaction().begin();
		em.persist(tele);
		em.getTransaction().commit();
	}
	
	

}
