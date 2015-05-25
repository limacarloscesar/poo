package br.iftm.edu.prova2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojadb");
		EntityManager em = factory.createEntityManager();
		
		Pessoa pessoa1 = new Pessoa("João");
		PessoaJuridica pj = new PessoaJuridica("Maria", "12312313");
		PessoaFisica pf = new PessoaFisica("Marta", "64564566");
		
		em.getTransaction().begin();
		em.persist(pessoa1);
		em.persist(pj);
		em.persist(pf);
		em.getTransaction().commit();
		
	}

}
