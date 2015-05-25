package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class ProgBuscaPorParametro {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		
		Query q = (Query) em.createNamedQuery("Estado.findByName");
		q.setParameter("nome", "Mato Grosso do Sul");
		Estado e = (Estado) ((javax.persistence.Query) q).getSingleResult();
		
		System.out.println("Estado: " + e.getNome());
		System.out.println("Sigla: " + e.getSigla());
		System.out.println("Capital: " + e.getGovernador().getNome());
		
	}

}
