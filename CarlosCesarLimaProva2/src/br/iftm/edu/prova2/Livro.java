package br.iftm.edu.prova2;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	@Id
	@GeneratedValue
	private int id;
	private String titulo, subtitulo;
	private int qtdpaginas;
	@ManyToMany
	private Collection<Autor> autores = new ArrayList<Autor>();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public int getQtdpaginas() {
		return qtdpaginas;
	}
	public void setQtdpaginas(int qtdpaginas) {
		this.qtdpaginas = qtdpaginas;
	}
	public Collection<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}
	public int getId() {
		return id;
	}
	public Livro(String titulo, String subtitulo, int qtdpaginas, Autor autor) {
		super();
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.qtdpaginas = qtdpaginas;
		this.autores.add(autor);
	}
	
	
	

}
