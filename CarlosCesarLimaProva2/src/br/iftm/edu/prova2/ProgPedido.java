package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgPedido {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Cliente c1 = new Cliente("Flavia");
		
		Produto p1 = new Produto("Cerveja Skol", 2.45);
		Produto p2 = new Produto("Picanha KG", 23.00);
		
		Pedido ped = new Pedido(c1);
		
		ped.addProduto(p1);
		ped.addProduto(p2);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(p1);
		em.persist(p2);
		em.persist(ped);
		em.getTransaction().commit();
				
		}
}