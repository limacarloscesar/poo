package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	
	
}
