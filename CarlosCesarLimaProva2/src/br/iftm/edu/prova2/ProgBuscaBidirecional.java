package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgBuscaBidirecional {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Estado ms = em.find(Estado.class, 1);
		Governador gov = ms.getGovernador();
		
		System.out.println("Estado: " + ms.getNome());
		System.out.println("Sigla: " + ms.getSigla());
		System.out.println("Governador: " + gov.getNome());
		
		gov = em.find(Governador.class, 1);
		ms = gov.getEstado();
		
		System.out.println("Estado: " + ms.getNome());
		System.out.println("Sigla: " + ms.getSigla());
		System.out.println("Governador" + ms.getGovernador());

	}

}
