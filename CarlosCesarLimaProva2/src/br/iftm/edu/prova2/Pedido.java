package br.iftm.edu.prova2;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Cliente cliente;
	@OneToMany
	private Collection<Produto> produtos = new ArrayList<Produto>();
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Collection<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	public int getId() {
		return id;
	}
	
	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	
	public void addProduto(Produto produto){
		produtos.add(produto);
	}
	

}
