package br.iftm.edu.prova2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="Estado.findByName", query="SELECT e FROM Estado e WHERE e.nome= :nome")
public class Estado {
	@Id
	@GeneratedValue
	private int id;
	private String nome, sigla, capital;
	@OneToOne
	private Governador governador;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Governador getGovernador() {
		return governador;
	}
	public void setGovernador(Governador governador) {
		this.governador = governador;
	}
	public int getId() {
		return id;
	}
	public Estado(String nome, String sigla, String capital,
			Governador governador) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
		this.governador = governador;
	}
	public Estado() {
		super();
	}
	
	

}
