package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Governador {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String partido;
	@OneToOne
	private Estado estado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public Governador(String nome, String partido) {
		super();
		this.nome = nome;
		this.partido = partido;
		
	}
	public Governador() {
		super();
	}
	
	

}
