package br.iftm.edu.prova2;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ProgProduto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		//Produto produt = new Produto("camiseta", 100);
		
		//em.getTransaction().begin();
		//em.persist(produt);
		//em.getTransaction().commit();
		
				
		
		Query q = em.createQuery("SELECT p FROM Produto p" );
		List<Produto> produtos = q.getResultList();
		
		for (int i =0 ; i < produtos.size(); i++){
			System.out.println("Produto " + produtos.get(i).getNome());
		}
	}

}
