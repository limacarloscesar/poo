package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgLivro {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Autor dan = new Autor("Dan Drown");
		Livro ponto_de_impacto = new Livro("Ponto de Impacto", null, 345, dan);
		
		em.getTransaction().begin();
		em.persist(dan);
		em.persist(ponto_de_impacto);
		em.getTransaction().commit();

	}

}
