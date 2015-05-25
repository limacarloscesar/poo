package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgEstado {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Governador gov = new Governador("Reinaldo Azanbuja", "PSDB");
		Estado ms = new Estado("Mato Grosso do Sul", "MS", "Campo Grande", gov);
		gov.setEstado(ms);
		
		em.getTransaction().begin();
		em.persist(gov);
		em.persist(ms);
		em.getTransaction().commit();

	}

}
