package br.iftm.edu.prova2;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	@OneToMany
	private Collection<Funcionario> funcionario = new ArrayList<Funcionario>();
	
	public Collection<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Collection<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	
	public Departamento(String nome) {
		super();
		this.nome = nome;
	}
	public Departamento() {
		super();
	}
	
	public void addFuncionario(Funcionario func){
		funcionario.add(func);
	}
	

}
